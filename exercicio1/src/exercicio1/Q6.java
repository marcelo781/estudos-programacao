package exercicio1;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 06. Elabore um programa que imprima o antecessor e posterior de um número.
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um Valor");
		int x = entrada.nextInt();
		System.out.println("Valor Anterior de " + x + " é : " + (x - 1));
		System.out.println("Valor Posterior de " + x + " é : " + (x + 1));
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
	}

}
