package main.java.com.softlond.project;

import java.util.Scanner;

public class EliminarDuplicados {

  public static void eliminar(int a) {
    Scanner numeros = new Scanner(System.in);
    int[] arr = new int[a];
    int[] arrNuevo = new int[a];
    int mayor = 0;
    int j;

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    boolean rep;

    for (int i = 0; i < a; i++) {
      rep = false;
      j = 0;

      while (!rep && (j < mayor)) {
        if (arr[i] == arrNuevo[j]) {
          rep = true;
        }

        j++;
      }

      if (!rep) {
        arrNuevo[mayor] = arr[i];
        mayor++;
      }
    }

    System.out.println("Arreglo original: ");
    for (int i = 0; i < a; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nArreglo sin duplicados: ");
    for (int i = 0; i < mayor; i++) {
      System.out.print(arrNuevo[i] + " ");
    }
  }
}
