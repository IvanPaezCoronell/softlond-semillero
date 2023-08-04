package main.java.com.softlond.project;

public class Palindromo {

  public static void esPalindromo(String texto) {
    texto = texto.replace(" ", " ");

    for (int i = 0; i < texto.length() / 2; i++) {
      if (texto.charAt(i) == texto.charAt(texto.length() - 1 - i)) {
        System.out.println("Es palindromo!");
        break;
      } else {
        System.out.println("No es palindromo!");
      }
    }
  }
}
