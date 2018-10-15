public class Literal implements Evaluable {

    private int value;

    public Literal(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }

    public boolean equals(Object object) {
        return object.toString().equals(toString());
    }

    public String toString() {
        return "Literal[value = " + value + "]";
    }
}
