public class SimpleReplace {
    public static void main(String... args){
      String example = "In a dishwasher far far away";
      String a = "dishwasher";
      String b = "galaxy";

      String example1 = example.replace(a,b);

//      example.replace("dishwasher", "galaxy");
      example1.replace(a,b);
      // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
      // Please fix it for me!
      // Expected output: In a galaxy far far away

      System.out.println(example1);

    }
}
