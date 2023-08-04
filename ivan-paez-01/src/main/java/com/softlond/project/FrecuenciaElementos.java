package main.java.com.softlond.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciaElementos {

  public static void fre(int a) {
    Scanner numeros = new Scanner(System.in);
    Map<Integer, Integer> cont = new HashMap<>();

    int[] arr = new int[a];

    System.out.println("Digitar los elementos del arreglo --> ");

    for (int i = 0; i < a; i++) {
      arr[i] = numeros.nextInt();
    }

    for (Integer item : arr) {
      if (cont.containsKey(item)) {
        cont.put(item, cont.get(item) + 1);
      } else {
        cont.put(item, 1);
      }
    }
    System.out.println(cont);
  }
}
