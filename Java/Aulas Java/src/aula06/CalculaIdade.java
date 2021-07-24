package aula06;

import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.println();
		System.out.print("Digite o ano de nacimento: ");
		int anoNacimento = sc.nextInt();
		
		int idadeAtual = 2021 - anoNacimento;
		int idade2050 = 2050 - anoNacimento;
		
		System.out.println(nome + " Nasceu em " +anoNacimento+ " e sua idade atual é " +
				idadeAtual + " anos sendo que em 2050 terá " + idade2050);
		
		sc.close();
		
	}

}
