package exercisios_10072021;

import java.util.Scanner;

public class DemonstraMedia {
	
	public static void main(String[] args) {
		
		double notas = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas informadas:  ");
		int qtdNotas = sc.nextInt();
		
			for (int i = 1; i <= qtdNotas; i++) {
					System.out.println("informe a nota " + i + " ");
					double nota = sc.nextDouble();
					notas = nota + notas;
				}
					media = notas / qtdNotas;
					System.out.println("Medias das notas é : " + media);
		sc.close();
	}
}


