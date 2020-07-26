package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  public Animal() {
  }

  public void eat(){
    hunger--;
  }
  public void drink(){
    thirst--;
  }
  public void play(){
    hunger++;
    thirst++;
  }

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
