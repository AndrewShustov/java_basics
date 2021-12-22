import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operation operation;
        System.out.println("Введите первое число ");
        int firstValue = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число ");
        int secondValue = new Scanner(System.in).nextInt();

        System.out.println("Введите одну из следующих команд: ADD, SUBTRACT, MULTIPLY");
        String operationValue = new Scanner(System.in).next();
        if (!operationValue.equals("ADD") && !operationValue.equals("SUBTRACT") && !operationValue.equals("MULTIPLY")) {
            System.out.println("По умолчанию выбрана команда ADD");
            operation = Operation.valueOf("ADD");
        } else {
            operation = Operation.valueOf(operationValue);
        }

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(firstValue, secondValue);
        System.out.println("Результат равен " + arithmeticCalculator.calculate(operation));
    }
}
