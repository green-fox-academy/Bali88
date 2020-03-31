package aircraftCarrier;

public class Aircrafts {

    int MaxAmmo;
    int BaseDamage;

        
    public Aircrafts() {
        this.MaxAmmo = 0;
        this.BaseDamage = 0;

    }

    public int fight(){
        return MaxAmmo * BaseDamage;
    }

    public int refill(int numbOfRefillAmmo){

        return numbOfRefillAmmo - MaxAmmo;
    }

    public String getType(){
        return "Type of AirCraft ";
    }

}
