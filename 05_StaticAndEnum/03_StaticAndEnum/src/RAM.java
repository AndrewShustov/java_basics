public class RAM {
    private final RAMtype type;
    private final int memorySize;
    private final int weight;

    public RAM(RAMtype type, int memorySize, int weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public RAMtype getType() {
        return type;
    }

    public void setType(RAMtype type) {
        new RAM(type, memorySize, weight);
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        new RAM(type, memorySize, weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        new RAM(type, memorySize, weight);
    }

}
