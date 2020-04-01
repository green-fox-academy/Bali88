package AirCraft02;


import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<AirCraft> aircraftList;
    int AmmoStore;
    int HealthPoint;
    int InitialAmmo;

    public Carrier(int initialAmmo, int healthPoint) {
        this.InitialAmmo = initialAmmo;
        this.HealthPoint = healthPoint;
        this.aircraftList = new ArrayList<>();
        this.AmmoStore = this.InitialAmmo;


    }
    public void add(AirCraft newAircraft){
        aircraftList.add(newAircraft);
    }

    public void fill(){

    }
}
