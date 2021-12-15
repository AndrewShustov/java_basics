import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите минимальный этаж здания ");
        int minFloor = new Scanner(System.in).nextInt();
        System.out.print("Введите максимальный этаж здания ");
        int maxFloor = new Scanner(System.in).nextInt();
        while (minFloor > maxFloor) {
            System.out.print("Значение минимального этажа больше значения максимального этажа, введите минимальный этаж снова ");
            minFloor = new Scanner(System.in).nextInt();
        }
        while (minFloor > 1) {
            System.out.print("Значение минимального этажа не может быть больше 1, введите минимальный этаж снова ");
            minFloor = new Scanner(System.in).nextInt();
        }

        Elevator elevator = new Elevator(minFloor, maxFloor);

        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
