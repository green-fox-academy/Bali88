package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircraftList;
  private int storedAmmo;
  private int healthPoint;

  public Carrier(int initialAmmo, int healthPoint) {
    this.aircraftList = new ArrayList<>();
    storedAmmo = initialAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    aircraftList.add(aircraft);
  }

  public void fill() {
     
  }
}
