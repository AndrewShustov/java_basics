public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3, 5, 7);

        CargoInformation cargoInformation = new CargoInformation(4.5,
                "Norway",
                true,
                "794TXd",
                false,
                dimensions);

        System.out.println(cargoInformation);
        System.out.println("===========================================");

        cargoInformation.setCargoWeight(74);
        cargoInformation.setDestinationAddress("Scotland");
        dimensions.setHeight(8);
        dimensions.setLength(2);
        dimensions.setWidth(5);

        System.out.println(cargoInformation);
    }
}

