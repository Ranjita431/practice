import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileOutputStream output = new FileOutputStream("filename.txt");
      output.write("Hello".getBytes());
      output.close();  // must close manually
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}
