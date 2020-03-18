package petrolStation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("the station gas amount: " + Station.gasAmountStation);
        System.out.println("gas amount of the car " + car.gasAmountCar);
        Station.refill(car);
        System.out.println("the station gas amount: " + Station.gasAmountStation);
        System.out.println("gas amount of the car after refill: " + car.gasAmountCar);

        Station.refill(car);
        System.out.println("the station gas amount: " + Station.gasAmountStation);
        System.out.println("gas amount of the car after refill: " + car.gasAmountCar);
    }
}
