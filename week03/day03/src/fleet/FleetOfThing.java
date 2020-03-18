package fleet;

public class FleetOfThing {

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

        Thing getMilk = new Thing("get milk");
        Thing removeObstacles = new Thing("remove the obstacles");
        Thing standUp = new Thing("stand up");
        Thing eatLunch = new Thing("eat lunch");

        standUp.complete();
        eatLunch.complete();

        fleet.add(getMilk);
        fleet.add(removeObstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);







        System.out.println(fleet);
    }
}