import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Paths.get("my-first.txt");
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines.get(0));


        } catch(Exception ee) {

        }

            List<String> content = new ArrayList();

            try { // Required by Files.write(filePath, content)
                // Creates a new file if not exists and overwrites it's content
                // The elements of the content lists will become the lines of the file
                Path filePath = Paths.get("my-first.txt");
                Files.write(filePath, content);
            } catch (Exception e) {
                System.out.println("Uh-oh, could not write the file!");
        }



    }
}






