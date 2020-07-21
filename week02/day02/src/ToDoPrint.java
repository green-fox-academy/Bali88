public class ToDoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String a = "\n".concat("My todo: \n").concat(todoText);
    String b = a.concat(" - Download games\n");
    String c = b.concat("\t - Diablo");

    System.out.println(c);
  }
}

