package counter;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    counter.add();
    System.out.println(counter.getFieldValueCounter());
    counter.add();
    System.out.println(counter.getFieldValueCounter());
    counter.add();
    counter.add();
    System.out.println(counter.getFieldValueCounter());
    counter.reset();
    System.out.println(counter.getFieldValueCounter());
    counter.add(5);
    System.out.println(counter.getFieldValueCounter());
  }

}
