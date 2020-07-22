import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt


  }


  public static void decrypt() {
    Path filePath = Paths.get("doubled.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
  }
}
