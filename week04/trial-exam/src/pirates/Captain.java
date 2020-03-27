package pirates;

public class Captain extends Pirate {

    public Captain(String name, int amountOfGold, int healthPoint, boolean woodenLeg) {
        super(name, amountOfGold, healthPoint, woodenLeg, true);
    }

    public void work() {
        amountOfGold += 10;
        healthPoint -= 5;
    }

    public void party() {
        healthPoint += 10;
    }

}
