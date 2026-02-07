public class Main {
  public static void main(String[] args) {
    int passwordLength = 5;

    System.out.println(passwordLength >= 8); // false, too short
    System.out.println(passwordLength < 8);  // true, needs more characters
  }
}
