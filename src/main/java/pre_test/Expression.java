package pre_test;

public class Expression implements Evaluable {

    private Evaluable leftOperand;
    private Evaluable rightOperand;
    private final Operation operation;

    public Expression(Evaluable leftOperand, Evaluable rightOperand, Operation operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        Integer result = null;

        switch (operation) {
            case PLUS:
                result = leftOperand.evaluate() + rightOperand.evaluate();
                break;
            case MINUS:
                result = leftOperand.evaluate() - rightOperand.evaluate();
                break;
            case MULTIPLY:
                result = leftOperand.evaluate() * rightOperand.evaluate();
                break;
            case DIVISION:
                result = leftOperand.evaluate() / rightOperand.evaluate();
                break;
        }
        return result;
    }
}
