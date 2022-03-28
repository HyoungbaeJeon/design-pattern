package pre_test;

public class Operand implements Evaluable {

    private int value;

    public Operand(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
