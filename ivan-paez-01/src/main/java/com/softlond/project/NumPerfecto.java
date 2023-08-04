package main.java.com.softlond.project;

public class NumPerfecto {

  public static void esPerfecto(int a) {
    int suma = 0;

    for (int i = 1; i <= (a / 2); i++) {
      if (a % i == 0) suma += i;
    }

    System.out.println(
      (a == suma) ? "El numero es perfecto" : "El numero no es perfecto"
    );
  }
}
