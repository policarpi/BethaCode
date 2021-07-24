package aula07;

import java.util.Scanner;

public class TestaFor {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe um numero qualquer: ");
	int numero = sc.nextInt();
	
		for (int i = 1; i <= 10; i++) {
			int multiplicacao = numero * i;
			System.out.println(numero + " X " +i+ " = " +multiplicacao);
		}
	}
}
