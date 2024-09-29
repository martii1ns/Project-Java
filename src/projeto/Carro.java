package projeto;

public class Carro {

	String modelo;
	int velocidademaxima;
	int durabilidade;
	int manobrabilidade;
		
	public Carro(String modelo, int velocidademaxima, int durabilidade, int manobrabilidade) {
		this.modelo = modelo;
		this.velocidademaxima = velocidademaxima;
		this.durabilidade = durabilidade;
		this.manobrabilidade = manobrabilidade;
	}
	
	public void showspecs(){
		System.out.println("qual o modelo: " + modelo );
		System.out.println("velocidade maxima: " + velocidademaxima + "km");
		System.out.println("durabilidade: " + durabilidade);
		System.out.println("manobrabilidade: " + manobrabilidade); 
	}

}
