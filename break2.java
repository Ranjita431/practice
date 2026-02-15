public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      if (i == 2) {
        continue;
      }
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }
  }
}
