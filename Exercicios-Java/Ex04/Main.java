/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   //numero do funcionario
	   //horas trabalhadas
	   //valor por hora trabalhada 
	   
	   int num;
	   double horasTrabalhadas;
	   double valorHora;
	   double salario;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite seu número:");
	   num = sc.nextInt();
	   System.out.println("Digite suas horas trabalhadas:");
	   horasTrabalhadas = sc.nextDouble();
	   System.out.println("Digite quanto você ganha por hora:");
	   valorHora = sc.nextDouble();
	   
	   salario = horasTrabalhadas*valorHora;
	   
	   System.out.printf("Número: %d%n", num);
	   System.out.printf("Horas trabalhadas: %.2f%n", horasTrabalhadas);
	   System.out.printf("Salario: %.2f%n", salario);
        
        sc.close();
	}
}