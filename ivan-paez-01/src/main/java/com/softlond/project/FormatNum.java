package main.java.com.softlond.project;

public class FormatNum {

  public static void formatearNum(String a) {
    System.out.println("\nNumero formateado a 2 decimales:");
    System.out.println(String.format("%.3f", Double.parseDouble(a)));
  }
}
