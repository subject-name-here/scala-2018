package ru.spbau.jvm.scala

import ExpParser._
import org.antlr.v4.runtime.{ParserRuleContext, Token}
import org.antlr.v4.runtime.tree.ParseTree

import scala.collection.JavaConverters._

class VisitorImpl extends ExpBaseVisitor[Int] {
  override def visitOrExp(ctx: OrExpContext): Int = {
    val expressionParts = contextToExpressionParts[OrExpContext, AndExpContext](ctx, ctx => ctx.andExp)
    foldExpression[AndExpContext](expressionParts, ctx.m1, visitAndExp)
  }

  override def visitAndExp(ctx: AndExpContext): Int = {
    val expressionParts = contextToExpressionParts[AndExpContext, EqualExpContext](ctx, ctx => ctx.equalExp)
    foldExpression[EqualExpContext](expressionParts, ctx.m1, visitEqualExp)
  }

  override def visitEqualExp(ctx: EqualExpContext): Int = {
    val expressionParts = contextToExpressionParts[EqualExpContext, GreaterLessExpContext](ctx, ctx => ctx.greaterLessExp)
    foldExpression[GreaterLessExpContext](expressionParts, ctx.m1, visitGreaterLessExp)
  }

  override def visitGreaterLessExp(ctx: GreaterLessExpContext): Int = {
    val expressionParts = contextToExpressionParts[GreaterLessExpContext, AdditionExpContext](ctx, ctx => ctx.additionExp)
    foldExpression[AdditionExpContext](expressionParts, ctx.m1, visitAdditionExp)
  }

  override def visitAdditionExp(ctx: AdditionExpContext): Int = {
    val expressionParts = contextToExpressionParts[AdditionExpContext, MultiplyExpContext](ctx, ctx => ctx.multiplyExp)
    foldExpression[MultiplyExpContext](expressionParts, ctx.m1, visitMultiplyExp)
  }

  override def visitMultiplyExp(ctx: MultiplyExpContext): Int = {
    val expressionParts = contextToExpressionParts[MultiplyExpContext, AtomExpContext](ctx, ctx => ctx.atomExp)
    foldExpression[AtomExpContext](expressionParts, ctx.m1, visitAtomExp)
  }

  override def visitAtomExp(ctx: AtomExpContext): Int = {
    if (ctx.Number != null) {
      ctx.getText.toInt
    } else {
      visitOrExp(ctx.exp)
    }
  }

  private def contextToExpressionParts[P <: ParserRuleContext, S <: ParserRuleContext]
                                      (context: P,
                                       operandGetter: P => java.util.List[S])
                                      : ExpressionParts[S] = {
    val operators = context.children.asScala.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)
    val operands = operandGetter(context).asScala
    ExpressionParts[S](operands.head, operators.zip(operands.drop(1)).toList)
  }

  private def foldExpression[S <: ParserRuleContext]
                            (expressionParts: ExpressionParts[S],
                             initialValueContext: S,
                             contextVisitor: S => Int)
                            : Int = {
    val initialValue = contextVisitor(expressionParts.firstOperand)
    expressionParts.tail.foldLeft(initialValue)((accumulator: Int, expressionPart: (ParseTree, S)) => {
      val (operator, operand) = expressionPart
      useOperatorToken(accumulator, operator.getPayload.asInstanceOf[Token], contextVisitor(operand))
    })
  }
  
  private def useOperatorToken(leftOperand: Int, operator: Token, rightOperand: Int): Int = operator.getType match {
    case OR => boolToInt(leftOperand != 0 || rightOperand != 0)
    case AND => boolToInt(leftOperand != 0 && rightOperand != 0)
    case EQUAL => boolToInt(leftOperand == rightOperand)
    case NOT_EQUAL => boolToInt(leftOperand != rightOperand)
    case GREATER => boolToInt(leftOperand > rightOperand)
    case GREATER_EQUAL => boolToInt(leftOperand >= rightOperand)
    case LESS_EQUAL => boolToInt(leftOperand <= rightOperand)
    case LESS => boolToInt(leftOperand < rightOperand)
    case MULTIPLY => leftOperand * rightOperand
    case DIVIDE => leftOperand / rightOperand
    case MOD => leftOperand % rightOperand
    case PLUS => leftOperand + rightOperand
    case MINUS => leftOperand - rightOperand
    case _ => leftOperand
  }

  private def boolToInt(b: Boolean) = if (b) 1 else 0

  private case class ExpressionParts[S <: ParserRuleContext](firstOperand: S, tail: List[(ParseTree, S)])
}
