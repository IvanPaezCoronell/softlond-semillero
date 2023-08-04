package main.java.com.softlond.project;

public class AreaCirculo {

  public static void area(int radio) {
    double diametro, area, perimetro;

    diametro = 2 * radio;
    area = Math.PI * Math.pow(radio, 2);
    perimetro = diametro * Math.PI;

    System.out.println("Diametro: " + diametro);
    System.out.println("Area: " + area);
    System.out.println("Perimetro: " + perimetro);
  }
}
