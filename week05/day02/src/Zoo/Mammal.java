package Zoo;

public class Mammal extends Animal {

    boolean isItHuman;
    boolean isItNotaHuman;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing mini version out";
    }
}
