public class Parser {
    public int parse(String romanNumber) {
        validate(romanNumber);
        int currentNumber = RomanNumber.valueOf("" + romanNumber.charAt(romanNumber.length() - 1)).toValue();
        int valueParsed = 0;
        for (int i = romanNumber.length() - 1; i >= 0; --i) {
            final int nextNumber = RomanNumber.valueOf("" + romanNumber.charAt(i)).toValue();
            if (currentNumber > nextNumber) {
                valueParsed -= nextNumber;
            }
            else {
                valueParsed += nextNumber;
            }
            currentNumber = nextNumber;
        }
        return valueParsed;
    }

    private void validate(String romanNumber) {
        if (!RomanNumberValidator.validate(romanNumber)) {
            throw new RuntimeException("The number " + romanNumber + " is not valid");
        }
    }
}
