package InheritanceTask;

public class Sponsor extends Person {
    String company;
    int hiredStudent;


    public void introduce(){
        System.out.println("Hi, I'm " + name + " a " + age + " years old " + gender + " who represent " + company
        + " and hired " + hiredStudent " students so far.");
    }

    public void hire(int hiredStudent){
       this.hiredStudent +=1;
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers!");
    }

    public Sponsor(String name, int age, String gender, String  company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudent = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudent = 0;
    }
}
