package exercicio1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 01. Faça um algoritmo que receba dois números e ao final mostre a soma, 
		//subtração, multiplicação e a divisão dos números lidos.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira um número negão");
		int n1 = sc.nextInt();
			
		System.out.println("Insira um número negão");
		int n2 = sc.nextInt();
		
		System.out.println("SOMA " + (n1 + n2));
		System.out.println("SUBTRAÇÃO " + (n1 -n2));
		System.out.println("MULTIPLICAÇÃO " + (n1 * n2));
		System.out.println("DIVISÃO " + (n1 / n2));
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
