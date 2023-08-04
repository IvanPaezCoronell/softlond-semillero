package main.java.com.softlond.project;

public class Factorial {

  public static void calcFactorial(int a) {
    int factorial = 1;

    for (int i = 1; i <= a; i++) {
      factorial *= i;
      System.out.println(factorial + "*" + i);
    }
    System.out.println(a + "! = " + factorial);
  }
}
