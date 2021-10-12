package Aula15;

public class Gato  extends Animal{

	
	public Gato(String tipo, String nome) {
		super(tipo, nome);
	}
	
	@Override
	public void falar() {
		System.out.println("O gato esta falando |||  miau miau miau");
	}
	@Override
	public void andar() {
		System.out.println("O gato esta correndo atraz do gato");
	}
	

}
