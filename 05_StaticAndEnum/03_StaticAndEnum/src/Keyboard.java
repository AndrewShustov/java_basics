public class Keyboard {
    private final String type;
    private final boolean isBacklight;
    private final int weight;

    public Keyboard(String type, boolean isBacklight, int weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        new Keyboard(type, isBacklight, weight);
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public void setBacklight(boolean isBacklight) {
        new Keyboard(type, isBacklight, weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        new Keyboard(type, isBacklight, weight);
    }
}
