package pratica1;

import java.util.Scanner;

public class PrimeiroExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Diga seu nível de pirata pae");
		
		int pirata = entrada.nextInt();
		
		switch (pirata) {
		
		case 1: 
			System.out.println("Pirata iniciante");
			break;
		case 2: 
			System.out.println("Pirata prodígio");
			break;
		case 3: System.out.println("Pirata experiente");
		break;
		case 4: System.out.println("Pirata renomado");
		break;
		case 5: System.out.println("Pirata famoso");
		break;
		case 6: System.out.println("Schichibukai");
		break;
		case 7: System.out.println("Comandante de Yonkou");
		break;
		case 8: System.out.println("Imediato de Yonkou");
		break;
		case 9: System.out.println("Yonkou");
		break;
		case 10: System.out.println("Rei dos Piratas");
		break;
		default: System.out.println("Número inválido, escolha de 1 a 10");
		}
		
		
		entrada.close();
	}

}

