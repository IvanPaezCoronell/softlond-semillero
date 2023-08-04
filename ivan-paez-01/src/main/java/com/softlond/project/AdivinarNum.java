package main.java.com.softlond.project;

public class AdivinarNum {

  public static void num(int a) {
    int random = (int) (Math.random() * (100 - 0) + 1);

    if (a > random) {
      System.out.println("El numero ingresado es mayor al numero a adivinar!");
      System.out.println(
        "Numero random: " + random + " Numero ingresado: " + a
      );
    } else if (a < random) {
      System.out.println("El numero ingresado es menor al numero a adivinar!");
      System.out.println(
        "Numero random: " + random + " Numero ingresado: " + a
      );
    } else {
      System.out.println("Ganastes!, Haz adivinado el numero!");
      System.out.println(
        "Numero random: " + random + " Numero ingresado: " + a
      );
    }
  }
}
