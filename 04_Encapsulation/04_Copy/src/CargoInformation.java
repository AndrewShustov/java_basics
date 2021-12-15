public class CargoInformation {

    private final double cargoWeight;
    private final String destinationAddress;
    private final boolean flipPossible;
    private final String regNumber;
    private final boolean fragileCargo;
    private final Dimensions dimensions;

    public CargoInformation(double cargoWeight, String destinationAddress, boolean flipPossible, String regNumber, boolean fragileCargo, Dimensions dimensions) {
        this.cargoWeight = cargoWeight;
        this.destinationAddress = destinationAddress;
        this.flipPossible = flipPossible;
        this.regNumber = regNumber;
        this.fragileCargo = fragileCargo;
        this.dimensions = dimensions;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public CargoInformation setCargoWeight(double cargoWeight) {
        return new CargoInformation(cargoWeight, destinationAddress, flipPossible, regNumber, fragileCargo, dimensions);
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public CargoInformation setDestinationAddress(String destinationAddress) {
        return new CargoInformation(cargoWeight, destinationAddress, flipPossible, regNumber, fragileCargo, dimensions);
    }

    public boolean isFlipPossible() {
        return flipPossible;
    }

    public CargoInformation setFlipPossible(boolean flipPossible) {
        return new CargoInformation(cargoWeight, destinationAddress, flipPossible, regNumber, fragileCargo, dimensions);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public CargoInformation setRegNumber(String regNumber) {
        return new CargoInformation(cargoWeight, destinationAddress, flipPossible, regNumber, fragileCargo, dimensions);
    }

    public boolean isFragileCargo() {
        return fragileCargo;
    }

    public CargoInformation setFragileCargo(boolean fragileCargo) {
        return new CargoInformation(cargoWeight, destinationAddress, flipPossible, regNumber, fragileCargo, dimensions);
    }

    public int getDimensions() {
        return dimensions.volumeCalculate();
    }

    public String toString() {
        return cargoWeight + "\n"
                + destinationAddress + "\n"
                + dimensions.volumeCalculate() + "\n"
                + flipPossible + "\n"
                + regNumber;
    }
}
