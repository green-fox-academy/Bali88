package animal;

public class Animal {

    int hunger;
    int thirst;


    public Animal() {
        this.hunger = 50;
        this.thirst = 50;

    }

    public void eat() {
        hunger--;
    }


    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }


    public static void main(String[] args) {

        Animal dog = new Animal();

        System.out.println("hunger: " + dog.hunger);
        System.out.println("thirst: " + dog.thirst);

        dog.eat();
        dog.drink();
        System.out.println("hunger: " + dog.hunger);
        System.out.println("thirst: " + dog.thirst);

        dog.play();
        dog.play();
        System.out.println("hunger: " + dog.hunger);
        System.out.println("thirst: " + dog.thirst);
    }
}




