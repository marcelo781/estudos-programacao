package exercicio1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 07. O programa solicitará, além do nome do usuário, o peso e altura e fará o cálculo do 
		//Índice de Massa Corporal (IMC). 
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o Seu Nome :");
		String nome = entrada.nextLine();
		System.out.println("Informe o Seu Peso :");
		double peso = entrada.nextDouble();
		System.out.println("Informe a Sua Altura :");
		double altura = entrada.nextDouble();

		
		double imc = peso / (altura * altura);
		DecimalFormat df = new
		DecimalFormat("#.00");
		System.out.println("Olá " + nome + " o seu IMC é " + df.format(imc));
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
	}

}
