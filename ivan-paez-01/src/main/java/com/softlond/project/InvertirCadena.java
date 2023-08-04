package main.java.com.softlond.project;

public class InvertirCadena {

  public static void invertirOrden(String cadena) {
    StringBuilder sb = new StringBuilder(cadena);

    String cadenaInvertida = sb.reverse().toString();

    System.out.println(cadenaInvertida);
  }
}
