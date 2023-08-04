package main.java.com.softlond.project;

public class Ncaracteres {

  public static void contarCaracteres(String texto) {
    texto = texto.replaceAll(" ", "");

    int contador = 0;

    for (int i = 0; i < texto.length(); i++) {
      contador++;
    }
    System.out.println(contador);
  }
}
