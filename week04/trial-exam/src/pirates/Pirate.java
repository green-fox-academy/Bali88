package pirates;

public class Pirate {
    String name;
    int amountOfGold = 10;
    int healthPoint = 10;
    boolean woodenLeg;
    boolean isCaptain;

    public Pirate(String name,int amountOfGold, int healthPoint,boolean woodenLeg,boolean isCaptain){;
        this.name = name;
        this.amountOfGold = amountOfGold;
        this.healthPoint = healthPoint;
        this.woodenLeg = woodenLeg;
        this.isCaptain = isCaptain;
    }

    public void work() {
        amountOfGold += 1;
        healthPoint -=1;
    }

    public void party(){
        healthPoint += 1;
    }

    public String toString() {
        if (this.woodenLeg)
            return "Hello, I'm " + name + "." + " I have a wooden leg and " + amountOfGold + " golds ";
        else {
            return "Hello, I'm " + name + "." + " I have my real legs and " + amountOfGold + " golds ";
        }
    }
}


