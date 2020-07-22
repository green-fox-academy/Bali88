import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

//    createFile("test3.txt");

      try {
        Path filePath = Paths.get("test2.txt");
        List<String> lines = Files.readAllLines(filePath);
//        Files.readAllBytes(Paths.get(String.valueOf(lines)));
        for (String l: lines
             ) {
          System.out.println(l);
        }
      } catch (IOException e) {
        System.out.println("Unable to read file: my-file.txt");
//        e.printStackTrace();
      }

  }
  public static void createFile(String newFile)  {
    try {
      Files.createFile(Paths.get(newFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("file successfully created");
  }
}