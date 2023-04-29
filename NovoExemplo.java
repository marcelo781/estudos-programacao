package pratica1;

import java.util.Scanner;

public class NovoExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int n1 = entrada.nextInt();
		
		System.out.println("Insira um segundo número");
		int n2 = entrada.nextInt();
		
		System.out.println("Escolha uma opção aritmética (1 para soma, 2 para subtracao, 3 para divisao ou 4 para multiplicacao");
		int opcao = entrada.nextInt();
		
		int soma = n1+n2;
		int subtracao = n1-n2;
		int divisao = n1/n2;
		int multiplicacao = n1*n2;
		int resultado = 0;

		if (opcao == 1) {
			System.out.println("A soma é " + soma);
		} else {
			if (opcao == 2) {
				System.out.println("A subtracao é " + (subtracao)); 
			} else {
				if (opcao == 3) {
					System.out.println("A divisao é " + (divisao));
				} else {
					if (opcao == 4) {
						System.out.println("A multiplicao é " + (multiplicacao));
					} else { 
						if (opcao >= 4) {
							System.out.println("Opcao inválida, escolha entre 1 e 4");
						}
					}
				}
			}
		}
		
			if (opcao == 1) {
				 resultado = soma;
				} 		else {
							if (opcao == 2) {
								resultado = subtracao;	
								} else {
									if (opcao == 3) {
										 resultado = divisao;
									} else {
										if (opcao == 4) {
										 resultado = multiplicacao; 
										}
									}
								}
			}
	
			
			System.out.println("Agora vamos descobrir se o resultado é maior, menor ou igual a zero");
			if (resultado > 0) {
				System.out.println(resultado + " É maior que zero");
			} else {
				if (resultado < 0) {
					System.out.println(resultado + " É menor que zero");
				} else { 
					if (resultado == 0) {
						System.out.println(resultado + " É igual a zero");
					}
				}
			}
			
			System.out.println("Agora vamos descobrir se é par ou impar");
			if (resultado%2==0) {
				System.out.println("O número é par");
			} else { 
				System.out.println("O número é impar");
			}
			
			double valor = 0;
			
			
			do { 
				System.out.println("Informe o número -999 para encerrar");
				valor = entrada.nextDouble();
				} while (valor != -999);
				System.out.println("O programa está finalizado");
				
				
				entrada.close();
				
				
		}
}






