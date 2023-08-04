package main.java.com.softlond.project;

public class NumeroPar {

  public static void esPar(int a) {
    System.out.println(
      "El numero " + a + " es " + ((a % 2 == 0) ? "par" : " impar")
    );
  }
}
