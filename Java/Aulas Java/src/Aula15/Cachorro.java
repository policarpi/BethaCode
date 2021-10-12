package Aula15;

public class Cachorro extends Animal implements Fala{

	public Cachorro(String tipo, String nome) {
		super(tipo, nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void falar() {
		System.out.println("Cachorro falando ||| AU AU AU");
	}
	
	@Override
	public void andar() {
		System.out.println("Andando com as quatro patas!!!!!");
	}

	@Override
	public void formaDeFalar() {
		falar();
	}
}
