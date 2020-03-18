package petrolStation;

public class Station {

   static int gasAmountStation = 5000;

    public static void refill (Car car1) {
        gasAmountStation -= car1.capacityCar;
        car1.gasAmountCar += car1.capacityCar;
    }






}