package projeto;

public class Rally implements Corrida{
	public void competir(Carro carro, Piloto piloto) {
		int resultado = carro.durabilidade * piloto.habilidade + (int)(Math.random() * 50);
		System.out.println("corrida de rally realizada com " + resultado + " pontos");
	}

	@Override
	public void run(Carro carro, Piloto Piloto) {
		
	}
}
