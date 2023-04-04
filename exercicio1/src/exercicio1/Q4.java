package exercicio1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 04. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) 
		//prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o 
		//valor das prestações
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da Compra :");
				double valorDaCompra = 
				entrada.nextDouble();
				double valorParcelado = valorDaCompra / 
				5;
				System.out.println("O valor da parcela é de R$ " + valorParcelado);
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
	}

}
