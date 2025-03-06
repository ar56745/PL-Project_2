package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    /*
     * Part 2: impelement the visitor pattern for expressions
     */

    @Override
    public Float visitPlus(PlusExpr x) {
        return x.getE1().accept(this) + x.getE2().accept(this);
    }

    @Override
    public Float visitMinus(MinusExpr x) {
        return x.getE1().accept(this) - x.getE2().accept(this);
    }

    @Override
    public Float visitTimes(TimesExpr x) {
        return x.getE1().accept(this) * x.getE2().accept(this);
    }

    @Override
    public Float visitDiv(DivExpr x) {
        return x.getE1().accept(this) / x.getE2().accept(this);
    }

    @Override
    public Float visitFloat(FloatExpr x) {
        return x.literal;
    }
}
