package cloneable;

public class Main {
  public static void main(String[] args) {
    Student john = new Student("John",20,"male","BME");
    System.out.println(john.getName());
    Student johnTheClone = john.clone();
    System.out.println(johnTheClone.getName());
  }
}
