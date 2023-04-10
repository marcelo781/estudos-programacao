import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe um valor");
		int numero = entrada.nextInt();
		
		String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";
		
		System.out.println(resultado);
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
