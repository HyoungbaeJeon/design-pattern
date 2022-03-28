package pre_test;

public enum Operation {
    PLUS("PLUS"),
    MINUS("MINUS"),
    MULTIPLY("MULTIPLY"),
    DIVISION("DIVISION");

    private final String value;

    Operation(String value) {
        this.value = value;
    }
}
