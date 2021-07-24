package aula07;

import java.util.Scanner;

public class testaCase {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Informe o dia da semana de  1 a 7:  ");
	int diaDaSemanna = sc.nextInt();
	System.out.print("");

	switch (diaDaSemanna) {
	case 1: {
		System.out.println(diaDaSemanna + " - Segunda feira");
		break;
	}
	case 2: {
		System.out.println(diaDaSemanna + " - Terça feira");
		break;
	}
	case 3: {
		System.out.println(diaDaSemanna + " - Quarta feira");
		break;
	}
	case 4: {
		System.out.println(diaDaSemanna + " - Quinta feira");
		break;
	}
	case 5: {
		System.out.println(diaDaSemanna + " - Sexta feira");
		break;
	}
	case 6: {
		System.out.println(diaDaSemanna + " - Sabado");
		break;
	}
	case 7: {
		System.out.println(diaDaSemanna + " - Domingo");
		break;
	}
	default:
		System.out.println("Dia da semana invaldo");
		break;
	}
	
	System.out.println("Continua");
	sc.close();	
	}
	
	
	
}
