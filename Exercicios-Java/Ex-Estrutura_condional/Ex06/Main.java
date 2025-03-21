/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um valor:");
	    double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25){
		    System.out.printf("Intervalo: 0 - 25 | Valor: %.2f", valor);
		}else if(valor > 25 && valor <= 50){
		    System.out.printf("Intervalo: 25 - 50 | Valor: %.2f", valor);;
		}else if(valor > 50 && valor <= 75){
		    System.out.printf("Intervalo: 50 - 75 | Valor: %.2f", valor);
		}else if(valor > 75 && valor <= 100){
		    System.out.printf("Intervalo: 75 - 100 | Valor: %.2f", valor);
		}else{
		    System.out.println("Fora de intervalo!");
		}
	}
}