package projeto;

public class LeMans implements Corrida {
	public void competir(Carro carro, Piloto piloto) {
		int resultado = (carro.velocidademaxima + carro.durabilidade) * piloto.habilidade / 2;
		System.out.println("a corrida le mans foi realizada com " + resultado + " pontos");
	}

	@Override
	public void run(Carro carro, Piloto Piloto) {
		
	}
}
