package projeto;

public class Nascar implements Corrida {
	public void competir(Carro carro, Piloto piloto) {
		int resultado = (carro.velocidademaxima + carro.durabilidade) * piloto.habilidade / 2;
		System.out.println("corrida nascar feita com " + resultado + " pontos");
	}

	@Override
	public void run(Carro carro, Piloto Piloto) {
		
	}
}
