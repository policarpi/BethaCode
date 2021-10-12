package Aula13;

import java.util.ArrayList;
import java.util.List;


public class CriadorDePalavra {
	
	public static void main(String[] args) {
		String teste01 = "Neemias Casonatto Policarpi";
		System.out.println(teste01 + " têm " + Palavras.numeroDeCaracteres(teste01) + " de careacteres");

	
		List<String> minhaLista = new ArrayList<>();
//		List<String> minhaLista = new ArrayList<>();
		minhaLista.add("Pedro");
		minhaLista.add("Tiago");
		minhaLista.add("Joao");
		
	
		System.out.println(Palavras.inverte("Neemias"));
		
		System.out.println(Palavras.contagais("Neemias"));

	
	
	}
	
	

}
