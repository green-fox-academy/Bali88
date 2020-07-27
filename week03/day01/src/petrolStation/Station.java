package petrolStation;

public class Station {
  int gasAmount = 500;

  public void refill(Car car) {
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
