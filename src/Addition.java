public final class Addition extends Operation {

    public Addition(Evaluable leftOperand, Evaluable rightOperand) {
        super(leftOperand, rightOperand);
    }

    public boolean equals(Object object) {
        return object.toString().equals(toString());
    }

    public int evaluate() {
        return super.getLeftOperand().evaluate() + super.getRightOperand().evaluate();
    }

    public String toString() {
        return "Addition[leftOperand = " + super.getLeftOperand().evaluate()
                + ", rightOperand = " + super.getRightOperand().evaluate() + "]";
    }
}
