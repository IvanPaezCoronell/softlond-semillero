import java.util.Scanner;
import main.java.com.softlond.project.AdivinarNum;
import main.java.com.softlond.project.AreaCirculo;
import main.java.com.softlond.project.AreaTriangulo;
import main.java.com.softlond.project.ArreglosNumeroMayor;
import main.java.com.softlond.project.ArreglosSuma;
import main.java.com.softlond.project.BuscarElemento;
import main.java.com.softlond.project.Capicua;
import main.java.com.softlond.project.Edad;
import main.java.com.softlond.project.EliminarDuplicados;
import main.java.com.softlond.project.Factorial;
import main.java.com.softlond.project.Fibonacci;
import main.java.com.softlond.project.FormatNum;
import main.java.com.softlond.project.FrecuenciaElementos;
import main.java.com.softlond.project.GenerarPassword;
import main.java.com.softlond.project.InvertirCadena;
import main.java.com.softlond.project.MostrarPalabra;
import main.java.com.softlond.project.Ncaracteres;
import main.java.com.softlond.project.Nfibonacci;
import main.java.com.softlond.project.NombreUsuario;
import main.java.com.softlond.project.Npalabras;
import main.java.com.softlond.project.NumPerfecto;
import main.java.com.softlond.project.NumPositivoNegativo;
import main.java.com.softlond.project.NumeroMayor;
import main.java.com.softlond.project.NumeroPar;
import main.java.com.softlond.project.NumeroPrimo;
import main.java.com.softlond.project.Operaciones;
import main.java.com.softlond.project.OrdenarArregloAsc;
import main.java.com.softlond.project.OrdenarPalabrasAlfab;
import main.java.com.softlond.project.Palindromo;
import main.java.com.softlond.project.PrimosRango;
import main.java.com.softlond.project.RemplazarLetra;
import main.java.com.softlond.project.RepLetra;
import main.java.com.softlond.project.RotarArreglo;
import main.java.com.softlond.project.TablaMultiplicar;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("----------- Ejercicio 01 ------------");
    System.out.println("Digitar dos numeros enteros --> ");
    Operaciones.operaciones(sc.nextInt(), sc.nextInt());

    System.out.println("\n----------- Ejercicio 02 ------------");
    System.out.println("Digitar numero entero -->");
    NumeroPar.esPar(sc.nextInt());

    System.out.println("\n----------- Ejercicio 03 ------------");
    System.out.println("Digitar el radio del circulo --> ");
    AreaCirculo.area(sc.nextInt());

    System.out.println("\n----------- Ejercicio 04 ------------");
    System.out.println("Digitar la edad --> ");
    Edad.esMayor(sc.nextInt());

    System.out.println("\n----------- Ejercicio 05 ------------");
    System.out.println("Digitar dos numeros enteros --> ");
    NumeroMayor.numMax(sc.nextInt(), sc.nextInt());

    System.out.println("\n----------- Ejercicio 06 ------------");
    System.out.println("Digitar numero entero --> ");
    NumPositivoNegativo.signoNumero(sc.nextInt());

    System.out.println("\n----------- Ejercicio 07 ------------");
    System.out.println("Digitar numero entero --> ");
    TablaMultiplicar.tabla(sc.nextInt());

    System.out.println("\n----------- Ejercicio 08 ------------");
    System.out.println("Digitar numero entero --> ");
    AdivinarNum.num(sc.nextInt());

    System.out.println("\n----------- Ejercicio 09 ------------");
    System.out.println("Digitar numero entero positivo--> ");
    Factorial.calcFactorial(sc.nextInt());

    System.out.println("\n----------- Ejercicio 10 ------------");
    System.out.println("Digitar numero entero --> ");
    Fibonacci.calcFibonacci(sc.nextInt());

    System.out.println("\n----------- Ejercicio 11 ------------");
    System.out.println("Digitar las longitudes de sus lados --> ");
    AreaTriangulo.formulaHeron(
      sc.nextDouble(),
      sc.nextDouble(),
      sc.nextDouble()
    );

    System.out.println("\n----------- Ejercicio 12 ------------");
    System.out.println("Digitar numero entero --> ");
    NumeroPrimo.esPrimo(sc.nextInt());

    System.out.println("\n----------- Ejercicio 13 ------------");
    System.out.println("Digitar numero decimal ej. (23.4233) --> ");
    FormatNum.formatearNum(sc.next());

    System.out.println("\n----------- Ejercicio 14 ------------");
    System.out.println("Digitar numero entero positivo --> ");
    NumPerfecto.esPerfecto(sc.nextInt());

    System.out.println("\n----------- Ejercicio 15 ------------");
    System.out.println("Digitar numero entero positivo --> ");
    Capicua.esCapicua(sc.nextInt());

    System.out.println("\n----------- Ejercicio 16 ------------");
    System.out.println("Digitar numero entero positivo y otro para n --> ");
    Nfibonacci.nCalcFibonacci(sc.nextInt(), sc.nextInt());

    // ?? System.out.println("\n----------- Ejercicio 17 ------------");
    // System.out.println("Digite un numero: ");
    // Primos p = new Primos();

    System.out.println("\n----------- Ejercicio 18 ------------");
    GenerarPassword.password();

    System.out.println("\n----------- Ejercicio 19 ------------");
    System.out.println("Digitar tu primer nombre --> ");
    NombreUsuario.nombreMayMin(sc.next());

    System.out.println("\n----------- Ejercicio 20 ------------");
    System.out.println("Digitar una cadena --> ");
    InvertirCadena.invertirOrden(sc.next());

    System.out.println("\n----------- Ejercicio 21 ------------");
    System.out.println("Digitar una cadena --> ");
    String cadena = sc.nextLine();
    System.out.println("Digitar una letra -->");
    char letra = sc.nextLine().charAt(0);
    RepLetra.nVecesLetra(cadena, letra);

    System.out.println("\n----------- Ejercicio 22 ------------");
    System.out.println("Digitar una cadena --> ");
    Palindromo.esPalindromo(sc.nextLine());

    System.out.println("\n----------- Ejercicio 23 ------------");
    System.out.println("Digitar una cadena --> ");
    Npalabras.contarPalabras(sc.nextLine());

    System.out.println("\n----------- Ejercicio 24 ------------");
    System.out.println("\nSeguir los pasos");
    System.out.println("1. Digitar una cadena");
    System.out.println("2. Digitar la letra que desea remplazar -->  ");
    System.out.println("3. Digitar la letra nueva -->  ");
    RemplazarLetra.remLetra(sc.nextLine(), sc.next(), sc.next());

    System.out.println("\n----------- Ejercicio 25 ------------");
    System.out.println("Digitar una cadena --> ");
    MostrarPalabra.palabra(sc.nextLine());

    System.out.println("\n----------- Ejercicio 26 ------------");
    System.out.println("Digitar una cadena --> ");
    Ncaracteres.contarCaracteres(sc.nextLine());

    // ?? System.out.println("\n----------- Ejercicio 27 ------------");
    // System.out.println("Digitar una cadena --> ");
    // OrdenarPalabrasAlfab.ordenarPalabra();

    System.out.println("\n----------- Ejercicio 28 ------------");
    System.out.println("Digitar la longitud del arreglo -->");
    ArreglosSuma.suma(sc.nextInt());

    System.out.println("\n----------- Ejercicio 29 ------------");
    System.out.println("Digitar la longitud del arreglo -->");
    ArreglosNumeroMayor.numMay(sc.nextInt());

    System.out.println("\n----------- Ejercicio 30 ------------");
    System.out.println("Digitar la longitud del arreglo -->");
    EliminarDuplicados.eliminar(sc.nextInt());

    // ?? System.out.println("\n----------- Ejercicio 31 ------------");
    // System.out.println("Digitar la longitud del arreglo -->");
    // OrdenarArregloAsc.ordenarArrAsc(sc.nextInt());

    System.out.println("\n----------- Ejercicio 32 ------------");
    System.out.println("Digitar la longitud del arreglo -->");
    int b = BuscarElemento.indice(sc.nextInt());
    System.out.println(
      (b == -1) ? "El numero no existe" : ("El numero esta en el indice " + b)
    );

    System.out.println("\n----------- Ejercicio 33 ------------");
    System.out.println("Digitar la longitud del arreglo -->");
    FrecuenciaElementos.fre(sc.nextInt());

    System.out.println("\n----------- Ejercicio 34 ------------");
    RotarArreglo.izq();
    
    // ?? System.out.println("\n----------- Ejercicio 35 ------------");
    // System.out.println("Digitar la longitud de la matriz -->");

  }
}

