public class Display {
    private final double diagonal;
    private final DisplayType type;
    private final int weight;

    public Display(double diagonal, DisplayType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        new Display(diagonal, type, weight);
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
        new Display(diagonal, type, weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        new Display(diagonal, type, weight);
    }
}
