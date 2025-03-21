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
	    
	    System.out.println("Digite o codigo do pedido:");
	    int cod = sc.nextInt();
		System.out.println("Digite a quantidade:");
	    int qtd = sc.nextInt();
		
		double valorF;
		
		if(cod == 1){
		    valorF = 4.00*qtd;
		    System.out.printf("Preço a pagar: %.2f", valorF);
		}else if(cod == 2){
		    valorF = 4.50*qtd;
		    System.out.printf("Preço a pagar: %.2f", valorF);;
		}else if(cod == 3){
		    valorF = 5.00*qtd;
		    System.out.printf("Preço a pagar: %.2f", valorF);
		}else if(cod == 4){
		    valorF = 2.00*qtd;
		    System.out.printf("Preço a pagar: %.2f", valorF);
		}else if(cod == 5){
		    valorF = 1.50*qtd;
		    System.out.printf("Preço a pagar: %.2f", valorF);
		}else{
		    System.out.println("Código invalido!");
		}
	}
}