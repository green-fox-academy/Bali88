package petrolStation;

public class Main {
  public static void main(String[] args) {
    Car volvo = new Car();
    System.out.println(volvo.gasAmount);
    System.out.println(volvo.capacity);
    Station omv = new Station();
    System.out.println(omv.gasAmount);
    omv.refill(volvo);
    System.out.println(volvo.gasAmount);
    System.out.println(omv.gasAmount);



  }
}
