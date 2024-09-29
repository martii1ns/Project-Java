package projeto;

public class Drift implements Corrida {
	public void competir(Carro carro, Piloto piloto) {
		int resultado = carro.manobrabilidade * piloto.habilidade; 
		System.out.println("drift realizado com " + resultado + " pontos");
	}

	@Override
	public void run(Carro carro, Piloto Piloto) {
		
	}
}

