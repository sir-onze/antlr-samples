// Generated from Bank.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BankVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BankParser#transactions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactions(BankParser.TransactionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#movements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovements(BankParser.MovementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(BankParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#destAccount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestAccount(BankParser.DestAccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#signal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(BankParser.SignalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#ammount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmmount(BankParser.AmmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#originAccount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginAccount(BankParser.OriginAccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(BankParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BankParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(BankParser.DataContext ctx);
}