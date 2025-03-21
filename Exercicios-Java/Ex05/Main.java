/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   //codigo peca 1 e 2
	   //quantidade peca 1 e 2
	   //valor unitario peça 1 e 2
	   
	   int code01, code02, quantidade01, quantidade02;
	   double valorPeca01, valorPeca02, valorFinal;
	  
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o código da peça 01:");
	   code01 = sc.nextInt();
	   System.out.println("Digite a quantidade da peça 01:");
	   quantidade01 = sc.nextInt();
	   System.out.println("Digite o valor da peça 01:");
	   valorPeca01 = sc.nextDouble();
	   
	   System.out.println("Digite o código da peça 02:");
	   code02 = sc.nextInt();
	   System.out.println("Digite a quantidade da peça 02:");
	   quantidade02 = sc.nextInt();
	   System.out.println("Digite o valor da peça 02:");
	   valorPeca02 = sc.nextDouble();
	 
	    valorFinal = (quantidade01*valorPeca01) + (quantidade02*valorPeca02);
        sc.close();
        
        System.out.printf("Valor a pagar: %.2f", valorFinal);	 
        
	}
}