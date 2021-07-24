package Aula08;

import java.util.ArrayList;
import java.util.List;


public class FabricaDeCarros {
	
	public static void main(String[] args) {
		
		
		Carro carro01 =  new Carro();
		Carro carro02 =  new Carro();

		
	//	List<Carro> list = new ArrayList<>();
		
	//	list.add(new Carro("Fusca", "Azul", true));
	//	list.add(0, "Azul","Custa", true);
		
		carro01.modelo = "Fusca";
		carro01.cor = "Azul";
		carro01.ligado = false;
	/*	
		carro02.modelo = "Gol";
		carro02.cor = "Vermelho";
		carro02.ligado = true;
	*/	
//		carro01.ligar();
//		carro01.ligar();
		
		
		carro01.acelerar();
		carro01.ligar();
		carro01.acelerar();
		carro01.acelerar();
		carro01.desligar();
		carro01.ligar();
		carro01.acelerar();
		
		
		System.out.println("");
	}

}
