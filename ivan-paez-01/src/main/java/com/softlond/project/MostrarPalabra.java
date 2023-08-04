package main.java.com.softlond.project;

public class MostrarPalabra {

  public static void palabra(String texto) {
    for (var palabra : texto.split(" ")) {
      System.out.println(palabra);
    }
  }
}
