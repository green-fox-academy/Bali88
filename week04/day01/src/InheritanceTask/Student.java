package InheritanceTask;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public void getgoal(){
        System.out.println("Be a junior developer!");
    }

    public void introduce(){
        System.out.println("Hi I'm " + name + "," + "a" + age + "year old" + gender + "from" + previousOrganization
        + "who skipped" + skippedDays + "days from the school already.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }


    public Student() {
        super();
        this.previousOrganization = "The school of life!";
        this.skippedDays = 0;

    }
}

