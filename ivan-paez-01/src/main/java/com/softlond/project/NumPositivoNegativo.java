package main.java.com.softlond.project;

public class NumPositivoNegativo {

  public static void signoNumero(int a) {
    if (a < 0) {
      System.out.println("El numero " + a + " es negativo!");
    } else if (a > 0) {
      System.out.println("El numero " + a + " es positivo!");
    } else {
      System.out.println("El numero es cero!");
    }
  }
}
