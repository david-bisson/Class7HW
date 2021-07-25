public class CarFactory {

    public Drivable getCar(String carSpeed) {
        if (carSpeed == null) {
            return null;
        }
        try {
            if (carSpeed.equalsIgnoreCase("Fiat")) {
                return new Fiat();
            } else if (carSpeed.equalsIgnoreCase("BMW")) {
                return new BMW();
            } else if (carSpeed.equalsIgnoreCase("Porsche")) {
                return new Porsche();
            } else throw new InvalidCarException("Please use car types: Fiat, BMW or Porsche");
        }
        catch (NullPointerException | InvalidCarException m){
            System.out.println("Please use car types: Fiat, BMW or Porsche");
        }
        return null;
    }


}
