/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   
    //CALCULO DE IMPOSTO DE RENDA DE LISARB
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite seu salario:");
	    double salario = sc.nextDouble();
		double imposto = 0.0;
		
		if (salario > 2000) {
            if (salario <= 3000) {
                imposto = salario* 0.08;
            } else if (salario <= 4500) {
                imposto = salario * 0.18;
            } else {
                imposto = salario * 0.28;
            }
            System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);
        } else {
            System.out.println("ISENTO");
        }
		
	}
}