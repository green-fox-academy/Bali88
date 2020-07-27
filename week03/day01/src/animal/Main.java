package animal;

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    animal1.play();
    animal1.play();
    animal1.play();
    System.out.println(animal1.thirst);
    animal1.drink();
    System.out.println(animal1.thirst);

  }

}

