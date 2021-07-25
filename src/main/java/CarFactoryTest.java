public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Drivable myFiat = carFactory.getCar("Fiat");
        myFiat.drive();

        Drivable myBMW = carFactory.getCar("BMW");
        myBMW.drive();

        Drivable myPorsche = carFactory.getCar("Porsche1");
        myPorsche.drive();

    }
}
