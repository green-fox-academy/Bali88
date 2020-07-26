package homework;

public class Tree {
  String type;
  String leafColor;
  int age;
  char sex;

  public Tree(String type, String leafColor, int age, char sex) {
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;
  }

  public static void main(String[] args) {
    Tree tree1 = new Tree("oak", "green", 3, 'M');
    Tree tree2 = new Tree("pine", "green", 5, 'F');
    Tree tree3 = new Tree("walnut", "green", 8, 'F');
    Tree tree4 = new Tree("maple", "green", 4, 'M');
    Tree tree5 = new Tree("cherry", "green", 1, 'F');

  }

}
