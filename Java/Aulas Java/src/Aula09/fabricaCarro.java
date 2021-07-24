package Aula09;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class fabricaCarro {
	public static void main(String[] args)throws IOException, InterruptedException  {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Carro c1 = new Carro();
		
		c1.ano = 2020;
		c1.cor = "Vermelho";
		c1.modelo = "Ferrari";
		c1.velocidade_atual = 200;
		c1.velocidade_maxima = 300;
		
		//c1.licar();
		// c1.desligar();
		
		int opcao;
		
		do {
			System.out.println("Menu carro: ");
			System.out.println("1 - Ligar");
			System.out.println("2 - Desligado");
			System.out.println("3 - Acelerar");
			System.out.println("4 - Desacelerar");
			System.out.println("5 - Mostar dados");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				if (c1.ligar()) {
					System.out.println(c1.modelo + " Ligado com sucesso");
				}else { 
					System.out.println(c1.modelo + " Já estava ligado");
				}
			} else if (opcao == 2) {
				if (c1.desligar()) {
					System.out.println(c1.modelo + " Desligado com sucesso");
				}else {
					System.out.println(c1.modelo + " Já esta desligado");
				}
				
			} else if (opcao == 3 ) {
				System.out.println("Qual velocidade: ");
				int velocidadeUsuario = sc.nextInt();
				c1.acelerar(velocidadeUsuario);
				System.out.println(c1.velocidade_atual);
			} else if (opcao == 4 ) {
				System.out.println("Qual velocidade: ");
				int velocidadeUsuario = sc.nextInt();
				c1.desacelerar(velocidadeUsuario);
				System.out.println(c1.velocidade_atual);
			}else if (opcao == 5 ) {
				System.out.println(c1);
			}
			else if (opcao != 0 
					|| opcao !=1 
					|| opcao != 2 
					|| opcao != 3
					|| opcao != 4
					|| opcao != 5) {
				System.out.println("Opção invalida");
			}
			
			
			  if (System.getProperty("os.name").contains("Windows"))
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        else
		            Runtime.getRuntime().exec("clear");	
		} while (opcao != 0);
		
	}

}
