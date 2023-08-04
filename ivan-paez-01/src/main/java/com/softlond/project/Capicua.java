package main.java.com.softlond.project;

public class Capicua {

  public static void esCapicua(int a) {
    int cifra;
    int nuevoNumero = 0;
    int aDuplicado = a;

    while (aDuplicado != 0) {
      cifra = aDuplicado % 10;
      nuevoNumero = nuevoNumero * 10 + cifra;
      aDuplicado = aDuplicado / 10;
    }

    System.out.println(a + " --> " + nuevoNumero);
    System.out.println((a == nuevoNumero) ? "Es capicua" : "No es capicua");
  }
}
