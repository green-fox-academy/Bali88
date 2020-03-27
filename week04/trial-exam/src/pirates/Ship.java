package pirates;

import java.util.List;

public class Ship {

    List<Pirate> pirateList;
    Captain Jack;

    public Ship(List<Pirate> inputList, Captain c) {
        this.pirateList = inputList;
        this.Jack = c;
    }

    public void addPirate(Pirate newPirate){
        this.pirateList.add(newPirate);
    }
}
