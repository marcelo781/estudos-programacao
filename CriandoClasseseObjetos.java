
public class CriandoClasseseObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class Jogo {
			String produtora;
			String gênero;
			String nome;
			int dtLançamento; 
			double preço;
			String console;
			
			
		}
		
			Jogo super_mario; 
			super_mario = new Jogo();
		
			//Em uma linha:
			// Jogo super_mario = new Jogo();
			
			Jogo megaman;
			megaman = new Jogo();
			
			//Em uma linha:
			// Jogo megaman = new Jogo();
			
			Jogo sonic;
			sonic = new Jogo();
		
			//Em uma linha:
			// Jogo sonic = new Jogo();
			
			//Atribuindo e acessando atributos de objetos
			
			super_mario.produtora = "Nintendo";
			super_mario.console = "Nintendo Switch";
			super_mario.dtLançamento = 2017;
			super_mario.nome = "Super Mario Odyssey";
			super_mario.gênero = "Ação/Aventura";
			super_mario.preço = 299.90;
		
			megaman.produtora = "Capcom";
			megaman.console = "Playstation 4";
			megaman.console = "Xbox Series S";
			megaman.console = "Xbox Series X";
			megaman.console = "Nintendo Switch";
			megaman.dtLançamento = 2018;
			megaman.nome = "Megaman X Collection";
			megaman.gênero = "Ação/Aventura";
			megaman.preço = 89.90;
		
			sonic.produtora = "Sega";
			sonic.console = "Playstation 4";
			sonic.console = "Xbox Series X";
			sonic.console = "Nintendo Switch";
			sonic.dtLançamento = 2022;
			sonic.nome = "Sonic Frontiers";
			sonic.gênero = "Ação/Aventura";
			sonic.preço = 249.90;
		
			
			System.out.println("Super Mario");
			System.out.println("---------------------");
			System.out.println("Produtora: " + super_mario.produtora);
			System.out.println("---------------------");
			System.out.println("Consoles: " + super_mario.console);
			System.out.println("---------------------");
			System.out.println("Data de lançamento: " + super_mario.dtLançamento);
			System.out.println("---------------------");
			System.out.println("Nome: " + super_mario.nome);
			System.out.println("---------------------");
			System.out.println("Gênero: " + super_mario.gênero);
			System.out.println("---------------------");
			System.out.println("Preço: " + super_mario.preço);
	
	}			
	
			// Criando métodos
	
		double testarok = 1;
		
	
			double testeok() {
				
				System.out.println(testarok);
			
			return testarok; 	
			
			
			}
			
			double calcularpreçousado(double preço) {
			
			return preço / 2;
			
			}
			
			
	

}
