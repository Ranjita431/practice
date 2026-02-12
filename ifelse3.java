public class Main {
  public static void main(String[] args) {   
    int time = 22;
    String message = (time < 12) ? "Good morning."
                   : (time < 18) ? "Good afternoon."
                   : "Good evening.";
    System.out.println(message);
  }
}
