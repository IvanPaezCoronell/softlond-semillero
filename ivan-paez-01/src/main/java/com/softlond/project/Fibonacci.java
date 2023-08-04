package main.java.com.softlond.project;

public class Fibonacci {

  public static void calcFibonacci(int a) {
    int nums = 20;
    int numAnterior = 0;
    int numPosterior = 1;
    int sumaFibonacci;

    for (int i = 0; i <= nums; i++) {
      sumaFibonacci = numAnterior;
      numAnterior = numPosterior + numAnterior;
      numPosterior = sumaFibonacci;

      System.out.println(numPosterior);
    }
  }
}
