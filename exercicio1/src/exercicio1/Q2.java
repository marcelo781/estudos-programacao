package exercicio1;
import java.util.Scanner;
public class Q2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Questão 02. Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
		//mostre a temperatura em graus Celsius.
		//C = (5 * (F-32) / 9).
		
		double C, F;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe a Temp. em Farenheit :");
				F = entrada.nextDouble();
				C = (5 * (F-32) / 9);
				System.out.println("temperatura em graus Celsius é :" + C);

		entrada.close();
		
		
		
		
		
		
		
		
		
	}

}
