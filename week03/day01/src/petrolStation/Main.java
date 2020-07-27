package petrolStation;

public class Main {
  public static void main(String[] args) {
    Car volvo = new Car();
    System.out.println(volvo.getGasAmount());
    System.out.println(volvo.getCapacity());

    Station omv = new Station(500);
    System.out.println(omv.getGasAmount());
    omv.refill(volvo);
    
  }
}
