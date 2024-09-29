package projeto;

public class Piloto {

	String nome;
	int habilidade;
	
	public Piloto(String nome, int habilidade) {
		this.nome = nome;
		this.habilidade = habilidade;
	}
	
	public void showskills() {
		System.out.println("piloto " + nome);
		System.out.println("habilidade  " + habilidade);
	}
	
}