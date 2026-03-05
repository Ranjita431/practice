public class Main {
  public static void main(String[] args) {
    try {
      int result = 10 / 0;
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[10]);
    } 
    catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Math error or array error occurred.");
    }
  }
}
