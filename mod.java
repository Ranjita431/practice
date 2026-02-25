class Person {
  public String name = "John";   // Public - accessible everywhere
  private int age = 30;          // Private - only accessible inside this class
}

public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    System.out.println(p.name);   // Works fine
    System.out.println(p.age);    // Error: age has private access in Person
  }
}
