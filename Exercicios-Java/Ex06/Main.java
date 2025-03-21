/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   //Receber 3 valores: A,B e C
	   //Calcular area do triagulo retangulo
	   //area do circulo de raio C
	   //area do trapezio
	   //area do quadrado
	   //area do retangulo
	   
	   double valorA, valorB, valorC;
	  double areaTriangulo, areaTrapezio, areaQudrado, areaRetangulo, areaCirculo;
	  double raioC;
	  double pi = 3.14159;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o Valor A:");
        valorA = sc.nextDouble();
        System.out.println("Digite o Valor B:");
        valorB = sc.nextDouble();
        System.out.println("Digite o Valor C:");
        valorC = sc.nextDouble();
        
        raioC = valorC;
        
        areaTriangulo = (valorA*valorC)/2;
        areaCirculo = pi*(raioC*raioC);
        areaQudrado = valorB*valorB;
        areaRetangulo = valorA*valorB;
        areaTrapezio = ((valorA+valorB)*valorC)/2;
        
        System.out.printf("Triangulo: %f%n", areaTriangulo);
        System.out.printf("Circulo: %f%n", areaCirculo);
        System.out.printf("Trapezio: %f%n", areaTrapezio);
        System.out.printf("Quadrado: %f%n", areaQudrado);
        System.out.printf("Retangulo: %f%n", areaRetangulo);
        
        sc.close();
	}
}