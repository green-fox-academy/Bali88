package garden;

public class Tree extends Plants {
    public Tree(String color, int water) {
        super(color, water);
        this.ItNeedsWater = getItNeedsWater();
    }

    @Override
    public boolean getItNeedsWater() {
        if (water < 10) {
            return true;
        } else {
            return false;
        }
}


