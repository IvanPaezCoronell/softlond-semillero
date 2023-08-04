package main.java.com.softlond.project;

import java.util.Scanner;

public class ArreglosSuma {

  public static void suma(int a) {
    Scanner numeros = new Scanner(System.in);
    int[] arr = new int[a];
    int suma = 0;

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    for (int i = 0; i < a; i++) {
      suma += arr[i];
    }
    System.out.println("Suma: " + suma);
  }
}
