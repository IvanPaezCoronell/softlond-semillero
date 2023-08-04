package main.java.com.softlond.project;

public class Operaciones {

  public static void operaciones(int a, int b) {
    int suma = a + b;
    int resta = a - b;
    int multiplicacion = a * b;
    double division = a / b;

    System.out.println("Suma: " + a + " + " + b + " = " + suma);
    System.out.println("Resta: " + a + " - " + b + " = " + resta);
    System.out.println("Multiplicacion: " + a + " * " + b + " = " + multiplicacion);
    System.out.println("Division: " + a + " / " + b + " = " + division);
  }
}
