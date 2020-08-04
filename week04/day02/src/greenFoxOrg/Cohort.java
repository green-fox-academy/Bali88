package greenFoxOrg;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> studentList;
  private List<Mentor> mentorList;

  public Cohort(String name) {
    this.name = name;
    this.studentList = new ArrayList<>();
    this.mentorList = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.studentList.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentorList.add(mentor);
  }

  public void info() {
    System.out.println("The " + this.name + " cohort has " + studentList.size() + "students and " +
        mentorList.size() + "mentors.");
  }
}
