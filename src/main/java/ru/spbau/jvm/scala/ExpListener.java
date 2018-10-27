// Generated from /home/subject/Documents/alternative/scala-2018/src/main/antlr4/Exp.g4 by ANTLR 4.7
package ru.spbau.jvm.scala;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExpParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExpParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#orExp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(ExpParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#orExp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(ExpParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(ExpParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(ExpParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void enterEqualExp(ExpParser.EqualExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#equalExp}.
	 * @param ctx the parse tree
	 */
	void exitEqualExp(ExpParser.EqualExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#greaterLessExp}.
	 * @param ctx the parse tree
	 */
	void enterGreaterLessExp(ExpParser.GreaterLessExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#greaterLessExp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterLessExp(ExpParser.GreaterLessExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(ExpParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(ExpParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(ExpParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(ExpParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(ExpParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(ExpParser.AtomExpContext ctx);
}