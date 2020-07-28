package farm;

public class MainFarm {
  public static void main(String[] args) {
    Farm newFarm = new Farm();
    System.out.println(newFarm.getFreePlaces());
    Animal newAnimal = new Animal();
    newFarm.listOfAnimals.add(newAnimal);
    System.out.println(newFarm.listOfAnimals.size());
    newFarm.breed();
    System.out.println(newFarm.getFreePlaces());
    newFarm.breed();
    newFarm.breed();
    newFarm.breed();
    System.out.println(newFarm.getFreePlaces());
    System.out.println(newFarm.listOfAnimals.size());
    System.out.println(newAnimal.getHunger());

  }
}
