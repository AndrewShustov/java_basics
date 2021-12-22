public class ArithmeticCalculator {
    public static int firstValue;
    public static int secondValue;

    public ArithmeticCalculator(int firstValue, int secondValue) {
        ArithmeticCalculator.firstValue = firstValue;
        ArithmeticCalculator.secondValue = secondValue;
    }

    public int calculate(Operation operation) {
        int result = 0;
        if (operation.equals(Operation.ADD)) {
            result = firstValue + secondValue;
        } else if (operation.equals(Operation.SUBTRACT)) {
            result = firstValue - secondValue;
        } else if (operation.equals(Operation.MULTIPLY)) {
            result = firstValue * secondValue;
        }
        return result;
    }
}
