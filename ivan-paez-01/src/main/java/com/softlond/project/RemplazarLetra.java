package main.java.com.softlond.project;

public class RemplazarLetra {

  public static void remLetra(
    String texto,
    String letraNueva,
    String letraaRemplazar
  ) {
    System.out.println(texto.replace(letraNueva, letraaRemplazar));
  }
}
