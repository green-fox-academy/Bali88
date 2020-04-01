package Zoo;

public class Bird extends Animal {
    boolean itIsSinging;
    boolean itIsSmall;

    public Bird (String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
