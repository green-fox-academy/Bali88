package teacherStudent;

public class Student {
//  learn() -> prints the student is learning something new
//  question(teacher) -> calls the teachers answer method


  public Student() {
  }

  public void learn() {
    System.out.println("the student is learning something");
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}

