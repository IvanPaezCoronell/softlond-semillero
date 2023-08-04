package main.java.com.softlond.project;

import java.util.Scanner;

public class ArreglosNumeroMayor {

  public static void numMay(int a) {
    Scanner numeros = new Scanner(System.in);
    int[] arr = new int[a];
    int mayor = arr[0];

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    for (int i = 1; i < a; i++) {
      if (arr[i] > mayor) mayor = arr[i];
    }
    System.out.println("El numero mayor es: " + mayor);
  }
}
