package farm;

public class Animal {
  private int hunger = 50;
  private int thirst = 50;

  public int getHunger() {
    return hunger;
  }


  public Animal() {
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
