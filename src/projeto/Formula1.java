package projeto;

public class Formula1 implements Corrida {
	
	public void competir(Carro carro, Piloto piloto) {
		int resultado = carro.velocidademaxima * piloto.habilidade;
		System.out.println("corrida de f1 feita com " + resultado + " pontos");
	}

	@Override
	public void run(Carro carro, Piloto Piloto) {
		
	}
}

