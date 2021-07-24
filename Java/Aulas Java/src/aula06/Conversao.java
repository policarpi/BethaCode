package aula06;

public class Conversao {
	
	public static void main (String [] args) {
		
		short  idade = 16;
		
		int novaIdade;
		
		novaIdade = idade;
		
		System.out.println(novaIdade);
		
		idade = (short) novaIdade;
		
		System.out.println(idade);
		
		
	}

}