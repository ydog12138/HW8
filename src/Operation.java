public class Operation implements Evaluable{

    private Evaluable leftOperand;
    private Evaluable rightOperand;

    public Operation() {

    }

    public Operation(Evaluable leftOperand, Evaluable rightOperand) {
        if (leftOperand == null || rightOperand == null)
            throw new IllegalArgumentException();
        else {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }
    }

    public boolean equals(Object object) {
        return object.toString().equals(toString());
    }

    public int evaluate() {
        throw new UnsupportedOperationException();
    }

    public Evaluable getLeftOperand() {
        return leftOperand;
    }

    public Evaluable getRightOperand() {
        return rightOperand;
    }

    public void setLeftOperand(Evaluable leftOperand) {
        this.leftOperand = leftOperand;
    }

    public void setRightOperand(Evaluable rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String toString() {
        return "Operation[leftOperand = " + leftOperand.evaluate() +
                ", rightOperand = " + rightOperand.evaluate() + "]";
    }
}
