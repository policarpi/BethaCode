package exercicio;

import java.util.Scanner;

public class ClassificaJogador {

	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do jogador:  ");
		String jogador = sc.next();
		System.out.print("Digite a idade jogador:  ");
		int idade = sc.nextInt();
		
		String mensagemFinal = jogador;
		
			if (idade >= 10 || idade <= 12  ) {
				mensagemFinal += " têm vaga no Infanto-Juvenil";
				}else if (idade >= 16 || idade <= 18 ) {
					mensagemFinal += " tem vaga no Aspirante";
						}else if (idade >= 20 || idade <= 35 ) {
							mensagemFinal += " tem vaga no Profissional";
								}else {
									mensagemFinal += " para sua idade não temos vaga";
								}	
				System.out.println(mensagemFinal);
		sc.close();		
	}
}