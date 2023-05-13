import java.util.Scanner;

public class Listadeexerciciosarray {

	public static void main(String[] args) {

		// Sintaxe de código usando array:
		// public static void main(String[] args) 
		// int [] notas = new int[4];
		// notas[0] = 10;
		// notas[1] = 8;
		// notas[2] = 6;
		// notas[3] = 4; 
		// System.out.println("Nota do primeiro aluno : " + notas[0] );
		// System.out.println("Nota do segundo aluno : " + notas[1] );
		// System.out.println("Nota do terceiro aluno : " + notas[2] );
		// System.out.println("Nota do quarto aluno : " + notas[3] );
		
		// Usando o comando FOR para imprimir as notas:
		//  public static void main(String[] args) 
		// int[] notas = new int[4];
		// notas[0] = 10; 
		// notas[1] = 8;
		// notas[2] = 6;
		// notas[3] = 4; 
		// for(int i = 0; i <= 3; i++) {
		// System.out.println("Nota do aluno : " + notas[i] );
		// }
		
		
		// Usando o comando FOR para pedir ao usuário tanto pra informar e para imprimir as notas: 
		// public static void main(String[] args) 
		// Scanner entrada = new Scanner(System.in);
		// int[] notas = new int[4];
		// - Preenchendo o array notas
		// for (int i = 0; i <= 3; i++) {
		// System.out.println("Informe a nota : ");
		// notas[i] = entrada.nextint();
		// - Imprimindo o array notas
		// for (int i = notas) {
		// System.out.println(i);
		// } 
		
		
		
		
	
	
		// Usando o comando FOR para pedir ao usuário tanto pra informar e para imprimir as notas: 
			Scanner entrada = new Scanner(System.in);
				int[] notas = new int[4];
				// - Preenchendo o array notas
				 for (int i = 0; i <= 3; i++) {
				 System.out.println("Informe a nota : ");
				 notas[i] = entrada.nextInt();
				 }
				 //- Imprimindo o array notas
				 for (int i : notas) {
				 System.out.println(i);
				 } 
				
				entrada.close();
	
				
	}
				
				
				 }
	
	
	
				 

		
		
		
		
		
		
		
		
		
	
