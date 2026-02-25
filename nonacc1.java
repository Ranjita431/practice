public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod();           // Call the static method
    Main.myStaticMethod();      // Or call it using the class name
  }
}
