/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   //Verificar se numero é par ou não

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um número inteiro:");
	    int num = sc.nextInt();
		
		if((num % 2 ) == 0){
		    System.out.println("número é par");
		}
		else{
		    System.out.println("Número é impar");
		}
	}
}