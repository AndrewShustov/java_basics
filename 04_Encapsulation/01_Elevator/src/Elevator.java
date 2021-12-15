public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor = getCurrentFloor() - 1;
            System.out.println("Вы спустились на этаж ниже. Текущий этаж: " + currentFloor);
        } else
            System.out.println("Вы на нижнем этаже, выберите другой этаж");
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor = getCurrentFloor() + 1;
            System.out.println("Вы поднялись на этаж выше. Текущий этаж: " + currentFloor);
        } else
            System.out.println("Вы на последнем этаже, выберите другой этаж");
    }

    public void move(int floor) {
        if (floor == currentFloor + 1) {
            moveUp();
        } else if (floor == currentFloor - 1) {
            moveDown();
        } else if (floor == currentFloor) {
            System.out.println("");
        } else
            System.out.println("Выберите другой этаж");
    }
}
