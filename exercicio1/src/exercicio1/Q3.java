package exercicio1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 03. Faça um Programa que peça a temperatura em graus Celsius, transforme e 
		//mostre em graus Farenheit.
		//F° = [C°(temperatura dada) * 1.8] + 32
		
		
			double F;
			 Scanner entrada = new
			Scanner(System.in);
			System.out.println("Informe a Temp. em Celsius :");
			double C = entrada.nextDouble();
			F = (C * 1.8) + 32;
			System.out.println( C + "ºC em graus Celsius "+ "equivale em graus Farenheit "+ F + "ºF");

		
		entrada.close();
		
		
		
		
		
		
		
		
		
	}

}
