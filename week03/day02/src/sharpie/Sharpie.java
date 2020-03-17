package sharpie;

public class Sharpie {

    String color;
    Float width;
    Float inkAmount;

    public Sharpie(String color, Float width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100.0F;
    }

    public void use(){
        inkAmount--;
    }

    public static void main(String[] args) {
        Sharpie buddy = new Sharpie("brown",74.1F);
        System.out.println(buddy.inkAmount);

        buddy.use();
        System.out.println(buddy.color);
        System.out.println(buddy.width);
        System.out.println(buddy.inkAmount);
    }

}
