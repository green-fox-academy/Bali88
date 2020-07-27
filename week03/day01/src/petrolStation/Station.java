package petrolStation;

public class Station {
  private int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void refill(Car car) {
    gasAmount = car.getCapacity() - car.getGasAmount();
  }
}
