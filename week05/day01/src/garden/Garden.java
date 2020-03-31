package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plants> plants;

    public Garden(){
        this.plants = new ArrayList<>();


    }
    public void addPlants(Plants newPlant) {
        this.plants.add(newPlant);

}
}
