public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 0;

    System.out.println("Before division");  // Debug output

    int result = x / y;  // Crashes

    System.out.println("Result: " + result);  // Never runs
  }
}
