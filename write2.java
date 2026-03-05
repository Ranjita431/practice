import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
  public static void main(String[] args) {
    // true = append mode
    try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
      myWriter.write("\nAppended text!");
      System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

    