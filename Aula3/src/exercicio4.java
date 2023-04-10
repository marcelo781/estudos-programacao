import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maior ou igual a 20 add 10, senao subtrai de 5
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe um número inteiro");
		int numeroq4 = entrada.nextInt();
		
		System.out.println("Informe um número inteiro");
		int numeroq5 = entrada.nextInt();
		
		
		int soma = numeroq4 + numeroq5;
		
		
		int valor = (soma>=20) ? soma + 10 : soma - 5;
		System.out.println("O resultado será: " + valor);
	
		entrada.close();
		
		
		
		
		
		
		
		
		
		
	}

}
