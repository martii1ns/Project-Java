package projeto;
import java.util.Scanner;

public class SimuladorCorrida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Carro carro = new Carro ("eclipse", 350, 90, 95);
		Piloto piloto = new Piloto ("Martins", 90);
		 
		System.out.println("escolha o tipo de corrida: ");
		System.out.println("1 - Drift");
		System.out.println("2 - Formula 1");
		System.out.println("3 - Rally");
		System.out.println("4 - Nascar");
		System.out.println("5 - Le Mans");
		
		int escolha = scanner.nextInt();
		Corrida corrida = null;
		
		switch (escolha) {
		case 1:
			corrida = new Drift();
			break;
		case 2:
			corrida = new Formula1();
			break;
		case 3:
			corrida = new Rally();
			break;
		case 4:
			corrida = new Nascar();
			break;
		case 5:
			corrida = new LeMans();
			break;
		default:
			System.out.println("escolha inválida");
		}
		if (corrida != null) {
			carro.showspecs();
			piloto.showskills();
			corrida.run(carro, piloto);
		}
	scanner.close();
	}
}
