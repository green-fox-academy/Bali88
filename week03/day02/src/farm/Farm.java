package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> listOfAnimals;
  private int freePlaces = 10;

  public int getFreePlaces() {
    return freePlaces;
  }

  public Farm() {
    this.listOfAnimals = new ArrayList<>();
  }

  public void breed() {
    if (freePlaces > listOfAnimals.size()) {
      listOfAnimals.add(new Animal());
      freePlaces--;
    }
  }

  public void slaughter() {
    int hungerTheLeast = 0;
    for (Animal valami:listOfAnimals) {


    }
  }
}
