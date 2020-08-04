package greenFoxOrg;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of life";
    this.skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior developer.");
  }

  @Override
  public void introduce() {
    System.out
        .println("Hi, I'm " + super.getName() + " , a " + super.getAge() + " year old " + getGender()
            + " from " + previousOrganization + " who skipped " + skippedDays +
            " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }
}
