package teacherStudent;

public class Teacher {

//teach(student) -> calls the students learn method
//answer() -> prints the teacher is answering a question


  public Teacher() {
  }

  public void teach(Student student) {
    student.learn();
  }

  public void answer() {
    System.out.println("the teacher is answering");
  }

}
