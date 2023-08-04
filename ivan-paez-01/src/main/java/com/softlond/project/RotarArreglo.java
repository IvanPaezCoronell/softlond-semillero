package main.java.com.softlond.project;

import java.util.Arrays;
import java.util.Scanner;

public class RotarArreglo {

  public static void izq() {
    Scanner numeros = new Scanner(System.in);

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    int primerNum = arr[0];

    // System.out.println("Digitar los elementos del arreglo --> ");

    // for (int i = 0; i < arr.length; i++) {
    //   arr[i] = numeros.nextInt();
    // }

    System.out.println("Arreglo original " + Arrays.toString(arr));

    if (arr.length > 1) {
      for (int j = 1; j < arr.length; j++) {
        arr[j - 1] = arr[j];
      }

      arr[arr.length - 1] = primerNum;

      System.out.println(
        "Arreglo rotado a la izquierda " + Arrays.toString(arr)
      );
    }
  }
}
