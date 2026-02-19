public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
    
    System.out.println("Rows: " + myNumbers.length);             // 2
    System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
    System.out.println("Cols in row 1: " + myNumbers[1].length); // 5
  }
}
