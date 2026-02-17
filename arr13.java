public class Main {
  public static void main(String[] args) {
    int[] numbers = {45, 12, 98, 33, 27};

    int max = numbers[0];
    int min = numbers[0];

    for (int n : numbers) {
      if (n > max) {
        max = n;
      }
      if (n < min) {
        min = n;
      }
    }

    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }
}


