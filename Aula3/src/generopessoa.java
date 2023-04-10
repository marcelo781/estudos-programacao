import java.util.Scanner;

public class generopessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ian = new Scanner(System.in);

		System.out.println("Informe o sexo");
		
		String sexo = ian.next().toUpperCase();
		
		switch (sexo) {
		
		case "M":
			System.out.println("Masculino");
			break;
		case "F": 
			System.out.println("Feminino");
			break;
		default:
			System.out.println("Sexo Inválido");
		}
		
		
		ian.close();
		
		
	}

}
