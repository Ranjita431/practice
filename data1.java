import java.time.LocalTime;  // import the LocalTime class

public class Main {  
  public static void main(String[] args) {  
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
  }  
}

// Note: This example displays the server's local time, which may differ from your local time.
