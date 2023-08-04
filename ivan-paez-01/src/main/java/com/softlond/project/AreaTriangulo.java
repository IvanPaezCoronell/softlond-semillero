package main.java.com.softlond.project;

public class AreaTriangulo {

  public static void formulaHeron(double a, double b, double c) {
    double semiperimetro = (a + b + c) / 2;
    double heron =(semiperimetro *(semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    double area = Math.sqrt(heron);

    System.out.println("El area del triangulo es: " + area);
  }
}
