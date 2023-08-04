package main.java.com.softlond.project;

public class PrimosRango {

  public void nPrimos(int min, int max) {
    if (min > 0 && max > 0) {
      int cant = 0;
      int inf = (min < max) ? max : min;
      int sup = (min > max) ? max : min;

      for (int i = inf; i <= sup; i++) {
        if (esPrimo(i)) {
          System.out.print(i + " ");
          cant++;
        }
      }

      System.out.println("hay " + cant + " primos");
    } else {
      System.out.println("Los rangos deben ser positivos");
    }
  }

  public boolean esPrimo(int a) {
    boolean primo = true;

    if (a == 1 || ((a % 2) == 0 && a > 2)) {
      primo = false;
    } else {
      for (int i = 2; i < (a / 2); i++) {
        if (a % i == 0) {
          primo = false;
          break;
        }
      }
    }

    return primo;
  }
}
