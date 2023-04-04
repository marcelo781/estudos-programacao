package exercicio1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 05. A padaria da FPB vende certa quantidade de pães franceses e uma 
		//quantidade de broas a cada dia. Cada pãozinho custa R$ 0.12 e a broa custa R$ 1.50. 
		//Ao final do dia, o dono quer saber o quanto arrecadou com as vendas dos pães e das 
		//broas, o mesmo deve guardar 10% do que arrecadou na poupança. Desenvolva um 
		//programa para informar ao dono o valor arrecado, bem como o valor a ser 
		//depositado.
		//Obs.:Utilizar a classe abaixo
		//DecimalFormat df = new DecimalFormat("##.00");
		//df.format();
		
		
		
		double valorPao = 0.12, valorBroa = 1.50, 
				valorDia, poupanca;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Informe a Qtde de Pães Vendido :");
				int qtdPao = entrada.nextInt();
				System.out.println("Informe a Qtde de Broas Vendidas :");
				int qtdBroa = entrada.nextInt();

		
				valorDia = (valorPao * qtdPao) + 
						(valorBroa * qtdBroa);
						poupanca = valorDia * 0.10;
						DecimalFormat df = new
						DecimalFormat("##.00");
						System.out.println("sem formatacao : " + valorDia);
						System.out.println("-----------");
						System.out.println("Valor do dia " + df.format(valorDia));
						System.out.println("sem formatacao : " + poupanca);
						System.out.println("-----------");
						System.out.println("Poupança " + df.format(poupanca));
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
