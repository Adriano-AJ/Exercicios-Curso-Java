/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   //Verificar se os numeros são multiplos

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um número inteiro:");
	    int num = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
	    int num2 = sc.nextInt();
		
		if((num % num2 ) == 0 || (num2 % num ) == 0 ){
		    System.out.println("São multiplos");
		}
		else{
		    System.out.println("Não são multiplos");
		}
	}
}