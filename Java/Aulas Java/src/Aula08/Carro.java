package Aula08;

public class Carro {

	String modelo;
	String cor;
	Boolean ligado;
	int velocidadeAtual;
	int velocidadeMaxima = 100;
	
	public void ligar() {
		if	(ligado) {
		System.out.println("Carro: " + modelo + " já foi "
				+ "ligado");
		}else {
			ligado = true;
			System.out.println("Carro: " + modelo + " ligado corretamente!!");
		}
	}
	
	public void desligar (){
		if(ligado) {
			ligado = false;
			velocidadeAtual = 0;
			System.out.println("Carro " + modelo +  " desligado corretamente");
		}else {
			System.out.println("Carro  " + modelo + " já"
					+ " esta desligado");
		}
	}
	
	public void acelerar () {
		if(ligado) {
			velocidadeAtual = velocidadeAtual + 60;
				if	(velocidadeAtual >= velocidadeMaxima) {
					System.out.println("Chegou no maximo do " + modelo + " ! Favor "
							+ "Seu carro sera desligado" );
					desligar();
				}else {
					System.out.println("Carro " + modelo + " sendo acelerado para: " + velocidadeAtual);
				}}else {
					System.out.println("Carro " + modelo + " não pode ser acelerado"
					+ " esta desligado!!");
		}
			
	}
}
