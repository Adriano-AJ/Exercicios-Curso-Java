/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   //Verificar se numero é negativo ou não

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	    int num = sc.nextInt();
		
		if(num >= 0){
		    System.out.println("Positivo");
		}
		else{
		    System.out.println("Negativo");
		}
	}
}