package greenFoxOrg;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + super.getName() + " , a " + super.getAge() + " year old " + super.getGender()
            + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
