package fleetOfThings;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Fleet newFleet = new Fleet();

    Thing toDo1 = new Thing("Get milk");
    Thing toDo2 = new Thing("Remove the obstacles");
    Thing toDo3 = new Thing("Stand up");
    Thing toDo4 = new Thing("Eat lunch");

    newFleet.add(toDo1);
    newFleet.add(toDo2);
    newFleet.add(toDo3);
    newFleet.add(toDo4);

    toDo3.complete();
    toDo4.complete();

    System.out.println(newFleet);
  }
}