import java.util.Scanner;

public class Arithmetic {
    private static int a;
    private static int b;
    private static int result;

    public Arithmetic() {
        sumNumbers(a, b);
        difNumbers(a, b);
        multNumbers(a, b);
        avgNumbers(a, b);
        maxNumbers(a, b);
        minNumbers(a, b);
    }

    public Arithmetic(int a, int b) {
        this();
        Arithmetic.a = a;
        Arithmetic.b = b;
    }

    public static void main(String[] args) {
        System.out.println("Insert");
        a = (new Scanner(System.in)).nextInt();
        b = (new Scanner(System.in)).nextInt();
        Arithmetic arithmetic = new Arithmetic(a, b);
    }

    public static void sumNumbers(int a, int b) {
        result = a + b;
        System.out.println("Сумма равна " + result);
    }

    public static void difNumbers(int a, int b) {
        if (a > b) {
            result = a - b;
        } else result = b - a;
        System.out.println("Разность равна " + result);
    }

    public static void multNumbers(int a, int b) {
        result = a * b;
        System.out.println("Произведение равно " + result);
    }

    public static void avgNumbers(int a, int b) {
        result = (b + a)/2;
        System.out.println("Среднее значение равно " + result);
    }

    public static void maxNumbers(int a, int b) {
        if (a > b) {
            result = a;
            System.out.println("Максимальное число равно " + result);
        } else if (a < b) {
            result = b;
            System.out.println("Максимальное число равно " + result);
        } else
            System.out.println("Числа равны");
    }

    public static void minNumbers(int a, int b) {
        if (a < b) {
            result = a;
            System.out.println("Минимальное число равно " + result);
        } else if (a > b) {
            result = b;
            System.out.println("Минимальное число равно " + result);
        } else
            System.out.println("Числа равны");
    }

}
