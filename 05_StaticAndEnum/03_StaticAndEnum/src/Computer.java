public class Computer {
    private final CPU cpu;
    private final RAM ram;
    private final MemoryStorage memoryStorage;
    private final Display display;
    private final Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(CPU cpu, RAM ram, MemoryStorage memoryStorage, Display display, Keyboard keyboard, String vendor, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.memoryStorage = memoryStorage;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(int frequency, int coresCount, String vendor, int weight) {
        cpu.setFrequency(frequency);
        cpu.setCoresCount(coresCount);
        cpu.setVendor(vendor);
        cpu.setWeight(weight);
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAMtype type, int memorySize, int weight) {
        ram.setType(type);
        ram.setMemorySize(memorySize);
        ram.setWeight(weight);
    }

    public MemoryStorage getMemoryStorage() {
        return memoryStorage;
    }

    public void setMemoryStorage(MemoryType type, int memorySize, int weight) {
        memoryStorage.setType(type);
        memoryStorage.setMemorySize(memorySize);
        memoryStorage.setWeight(weight);
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(double diagonal, DisplayType type, int weight) {
        display.setDiagonal(diagonal);
        display.setType(type);
        display.setWeight(weight);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String type, boolean isBacklight, int weight) {
        keyboard.setType(type);
        keyboard.setBacklight(isBacklight);
        keyboard.setWeight(weight);
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        new Computer(cpu, ram, memoryStorage, display, keyboard, vendor, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        new Computer(cpu, ram, memoryStorage, display, keyboard, vendor, name);
    }

    public int getComputerWeight() {
        return cpu.getWeight() + ram.getWeight() + memoryStorage.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "Частота процессора: " + cpu.getFrequency() + "\n" +
                "Число ядер процессора: " + cpu.getCoresCount() + "\n" +
                "Производитель процессора: " + cpu.getVendor() + "\n" +
                "Вес процессора: " + cpu.getWeight() + "\n" +
                "Тип оперативной памяти: " + ram.getType() + "\n" +
                "Объем оперативной памяти: " + ram.getMemorySize() + "\n" +
                "Вес оперативной памяти: " + ram.getWeight() + "\n" +
                "Тип накопителя информации: " + memoryStorage.getType() + "\n" +
                "Объем памяти накопителя информации: " + memoryStorage.getMemorySize() + "\n" +
                "Вес накопителя информации: " + memoryStorage.getWeight() + "\n" +
                "Диагональ дисплея: " + display.getDiagonal() + "\n" +
                "Тип дисплея: " + display.getType() + "\n" +
                "Вес дисплея: " + display.getWeight() + "\n" +
                "Тип клавиатуры: " + keyboard.getType() + "\n" +
                "Наличие подсветки: " + keyboard.isBacklight() + "\n" +
                "Вес клавиатуры: " + keyboard.getWeight() + "\n" +
                "Название компьютера: " + getName() + "\n" +
                "Производитель компьютера: " + getVendor();
    }

}
