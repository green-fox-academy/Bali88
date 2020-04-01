package Zoo;

public class Reptile extends Animal {

    boolean isItLizzard;
    boolean isItOther;


    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
