package main.java.com.softlond.project;

public class NumeroPrimo {

  public static void esPrimo(int a) {
    int contador = 0;
    int i = 1;

    while (i <= a) {
      if (a % i == 0) contador++;

      i++;
    }

    System.out.println(
      (contador == 2) ? "El numero es primo!" : "El numero no es primo!"
    );
  }
}
