/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{   
    //VERIFICAR COORDENADAS DO PONTO, COM BASE EM DUAS ENTRADAS DE VALORES
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a primeira coordenada:");
	    double x = sc.nextDouble();
	    System.out.println("Digite a segunda coordenada:");
	    double y = sc.nextDouble();
		
		if(x == 0 && y == 0){
		    System.out.printf("Está na origem.");
		}else if(x == 0 && (y > 0 || y < 0)){
		    System.out.printf("Eixo Y");;
		}else if(y == 0 && (x > 0 || x < 0) ){
		    System.out.printf("Eixo X");
		}else if(x > 0 && y > 0){
		    System.out.printf("Q1");
		}else if(x < 0 && y > 0){
		    System.out.printf("Q2");
		}else if(x < 0 && y < 0){
		    System.out.printf("Q3");
		}else if(x > 0 && y < 0){
		    System.out.printf("Q4");
		}else{
		    System.out.println("Erro.");
		}
	}
}