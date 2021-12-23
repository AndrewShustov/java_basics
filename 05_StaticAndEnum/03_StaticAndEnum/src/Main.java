public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(14, 3, "ASUS", 2);
        RAM ram = new RAM(RAMtype.DDR4, 589, 7);
        MemoryStorage memoryStorage = new MemoryStorage(MemoryType.SSD, 780, 5);
        Display display = new Display(27, DisplayType.TN, 15);
        Keyboard keyboard = new Keyboard("Механическая", true, 4);

        Computer computer = new Computer(cpu, ram, memoryStorage, display, keyboard, "MSI", "Office Pro");
        System.out.println("Общая масса компьютера равна " + computer.getComputerWeight());

        System.out.println(computer);
    }
}