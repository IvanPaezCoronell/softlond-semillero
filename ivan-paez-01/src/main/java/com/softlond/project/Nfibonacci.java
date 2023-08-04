package main.java.com.softlond.project;

public class Nfibonacci {

  public static void nCalcFibonacci(int a, int n) {
    int numAnterior = 0;
    int numPosterior = 1;
    int sumaFibonacci;

    for (int i = 0; i <= n; i++) {
      sumaFibonacci = numAnterior;
      numAnterior = numPosterior + numAnterior;
      numPosterior = sumaFibonacci;

      System.out.println(numPosterior);
    }
  }
}
