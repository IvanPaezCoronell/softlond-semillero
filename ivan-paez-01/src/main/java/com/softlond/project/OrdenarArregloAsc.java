package main.java.com.softlond.project;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArregloAsc {

  public static void ordenarArrAsc(int a) {
    Scanner numeros = new Scanner(System.in);
    int[] arr = new int[a];
    int cont = 0;

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    for (boolean ordenado = false; !ordenado;) {
      for (int i = 0; i < a - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int variable = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = variable;
          cont++;
        }
      }

      if (cont == 0) {
        ordenado = true;
      }
      cont = 0;
    }
    System.out.println(arr);
  }
}
