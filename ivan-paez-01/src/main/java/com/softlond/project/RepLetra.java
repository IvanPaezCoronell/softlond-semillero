package main.java.com.softlond.project;

public class RepLetra {

  public static void nVecesLetra(String cadena, char letra) {
    int contador = 0;

    for (int i = 0; i < cadena.length(); i++) {
      if (cadena.charAt(i) == letra) contador++;
    }

    System.out.println(
      "'" + letra + "'" + " Se repite " + contador + " veces."
    );
  }
}
