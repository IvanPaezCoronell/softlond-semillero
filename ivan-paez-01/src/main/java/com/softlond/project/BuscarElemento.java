package main.java.com.softlond.project;

import java.util.Scanner;

public class BuscarElemento {

  public static int indice(int a) {
    Scanner numeros = new Scanner(System.in);
    int[] arr = new int[a];
    int num;

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    System.out.println("Digitar el numero a busar -->");
    num = numeros.nextInt();

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] == num) {
        return j;
      }
    }

    return -1;
  }
}
