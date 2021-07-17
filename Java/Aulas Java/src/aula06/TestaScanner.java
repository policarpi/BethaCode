package aula01;

import java.util.Scanner;

public class TestaScanner {
	
	public static void main (String [] args) {
		
		Scanner  nomeQualquer = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = nomeQualquer.next();
		System.out.print("Nome informado: " + nome);
		
		nomeQualquer.close();
	}

}
