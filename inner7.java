// Normal class
class Animal {
  public void makeSound() {
    System.out.println("Animal sound");
  }
}

public class Main {
  public static void main(String[] args) {
    // Anonymous class that overrides makeSound()
    Animal myAnimal = new Animal() {
      public void makeSound() {
        System.out.println("Woof woof");
      }
    };

    myAnimal.makeSound();
  }
}
