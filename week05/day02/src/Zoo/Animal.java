package Zoo;

abstract public class Animal {

    String name;
    int age;
    String gender;
    int numberOfLegs;
    boolean isItDangerous;

    public Animal(String name) {
    this.name = name;
    }


    public String getName() {
    return name;
    }

    public abstract String breed();

}

