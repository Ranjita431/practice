public class Main {
  public static void main(String[] args) {
    int myNum = 5;        // myNum is an int
    myNum = "Hello";      // Error: cannot assign a String to an int

    String myText = "Hi"; // myText is a String
    myText = 123;         // Error: cannot assign a number to a String

    System.out.println(myNum);
    System.out.println(myText);
  }
}
