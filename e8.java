try {
  int result = 10 / 0;
} 
catch (Exception e) {
  System.out.println("General error.");
} 
catch (ArithmeticException e) {
  // This will never be reached
  System.out.println("Divide by zero.");
}