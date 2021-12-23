public class CPU {
    private final int frequency;
    private final int coresCount;
    private final String vendor;
    private final int weight;

    public CPU(int frequency, int coresCount, String vendor, int weight) {
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.vendor = vendor;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency){
        new CPU(frequency, coresCount, vendor, weight);
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount){
        new CPU(frequency, coresCount, vendor, weight);
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor){
        new CPU(frequency, coresCount, vendor, weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        new CPU(frequency, coresCount, vendor, weight);
    }
}
