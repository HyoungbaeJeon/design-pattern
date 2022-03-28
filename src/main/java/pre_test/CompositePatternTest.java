package pre_test;

public class CompositePatternTest {

    public static void main(String[] args) {
        Evaluable evaluable = new Operand(8);
        System.out.println("Result : " + evaluable.evaluate());

        Evaluable expression1 = new Expression(new Operand(3), new Operand(4), Operation.PLUS);
        System.out.println("Result : " + expression1.evaluate());

        Evaluable expression2
                = new Expression(
                new Expression(
                        new Expression(
                                new Operand(3),
                                new Operand(2),
                                Operation.MINUS
                        ),
                        new Expression(
                                new Operand(5),
                                new Operand(4),
                                Operation.PLUS
                        ),
                        Operation.MULTIPLY
                ),
                new Operand(2),
                Operation.DIVISION
        );
        System.out.println("Result : " + expression2.evaluate());
    }
}
