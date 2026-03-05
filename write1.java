import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    // FileWriter will be closed automatically here
    try (FileWriter myWriter = new FileWriter("filename.txt")) {
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
