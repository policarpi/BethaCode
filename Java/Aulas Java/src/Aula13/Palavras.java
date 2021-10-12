package Aula13;

import java.util.Iterator;
import java.util.List;

public class Palavras {
	
	public static int numeroDeCaracteres(String palavra) {
		// trim retira espaços em branco antes e depois
		// lenght conta quandidade de carateres 
		return palavra.trim().length();
	}
	
	
	public static String somaPalavras(List<String> palavrasASeremSomadas) {
	
		String retorno = "";
		
		for (String variavelLocalDoFor : palavrasASeremSomadas) {
			retorno = retorno + variavelLocalDoFor + " ";
			
		}
		
		return retorno;
		
	}
	
	public static String inverte(String palavra) {
		
		String palavrainvertida = " ";
		int tamanhoDaPalavra = palavra.trim().length();
		for (int i = tamanhoDaPalavra - 1 ; i>=0 ; i--) {
			palavrainvertida = palavrainvertida + palavra.charAt(i);
		}
		return palavrainvertida;
		}
	public static int contagais(String palavra) {
		int quantidadeDeCaracteres = palavra.trim().length();
		int numeroDeVogais = 0 ;
		
		for(int  posicao =0; posicao < quantidadeDeCaracteres; posicao ++) {
			
			if(palavra.toUpperCase().charAt(posicao) == 'A' 
					|| palavra.toUpperCase().charAt(posicao) == 'E'
					|| palavra.toUpperCase().charAt(posicao) == 'I'
					|| palavra.toUpperCase().charAt(posicao) == 'O'
					|| palavra.toUpperCase().charAt(posicao) == 'U') {
				numeroDeVogais = numeroDeVogais + 1;
			}
			
		}
		
		return numeroDeVogais;
		
	}


}
