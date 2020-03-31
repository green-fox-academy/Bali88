package garden;

public class Plants {
    private boolean itNeedsWater;
    String color;
    boolean ItNeedsWater;

    protected double water;

    public Plants(String color, int water) {
        this.color = color;
        this.water = water;
        this.itNeedsWater = getItNeedsWater();
    }

    public boolean getItNeedsWater() {
        if (water > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getWater() {
        return water;
    }

