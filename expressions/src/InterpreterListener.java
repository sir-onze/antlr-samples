// Generated from Interpreter.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InterpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InterpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(InterpreterParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(InterpreterParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(InterpreterParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(InterpreterParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(InterpreterParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(InterpreterParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(InterpreterParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(InterpreterParser.CommentContext ctx);
}