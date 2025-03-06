package src;

public interface ExprVisitor<R> {
    /*
     * Part 2: Implement the visitor pattern for expressions
     */
    R visitPlus(PlusExpr expr);
    R visitMinus(MinusExpr expr);
    R visitTimes(TimesExpr expr);
    R visitDiv(DivExpr expr);
    R visitFloat(FloatExpr expr);
}
