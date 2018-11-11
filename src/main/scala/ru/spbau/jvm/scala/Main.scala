package ru.spbau.jvm.scala

import org.antlr.v4.runtime._

class ParserException(s: String) extends Exception(s)

class ErrorListener(val errorType: String) extends BaseErrorListener() {
  override def syntaxError(
                            recognizer: Recognizer[_, _], // idea says type is: Recognizer[_, _ <: ATNSimulator]
                            offendingSymbol: Any,
                            line: Int,
                            charPositionInLine: Int,
                            msg: String,
                            e: RecognitionException
                          ): Unit = {
    throw new ParserException(errorType + " on line " + line + ", symbol " + (charPositionInLine + 1) + ": " + msg)
  }
}

object Main {
  def evaluate(expression: String): Int = {
    val lexer = new ExpLexer(CharStreams.fromString(expression))
    val parser = new ExpParser(new CommonTokenStream(lexer))

    lexer.removeErrorListener(ConsoleErrorListener.INSTANCE)
    lexer.addErrorListener(new ErrorListener("Lexer error"))

    parser.removeErrorListener(ConsoleErrorListener.INSTANCE)
    parser.addErrorListener(new ErrorListener("Parser error"))

    val root = parser.eval().exp
    val visitor = new VisitorImpl()
    visitor.visitOrExp(root)
  }

  def main(args: Array[String]): Unit = {
    println("Enter expression: ")
    val expression = scala.io.StdIn.readLine()
    try {
      println(evaluate(expression))
    } catch {
      case pe: ParserException => println(pe.getMessage)
      case _: ArithmeticException => println("Divide by zero!")
    }
  }
}