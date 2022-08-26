public enum RomanNumber {
    I,
    V,
    X,
    L,
    C;

    int toValue() {
        return switch (this) {
            case I -> 1;
            case X -> 10;
            case C -> 100;
            case V -> 5;
            case L -> 50;
        };
    }

    boolean untilThreePermitted() {
        return switch (this) {
            case I, X, C -> true;
            case V, L -> false;
        };
    }
}
