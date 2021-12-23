public class MemoryStorage {
    private final MemoryType type;
    private final int memorySize;
    private final int weight;

    public MemoryStorage(MemoryType type, int memorySize, int weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public void setType(MemoryType type) {
        new MemoryStorage(type, memorySize, weight);
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        new MemoryStorage(type, memorySize, weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        new MemoryStorage(type, memorySize, weight);
    }
}
