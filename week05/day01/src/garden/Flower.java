package garden;

public class Flower extends Plants {
    public Flower(String color, int water) {
        super(color, water);
        this.ItNeedsWater = getItNeedsWater();
    }
    @Override
    public boolean getItNeedsWater() {
        if (super.water < 5) {
            return true;
        } else {
            return false;
        }
}
