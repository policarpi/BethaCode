package aula2;

import java.util.Scanner;

public class TesteTernario {
	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de funcionarios? ");
		int qtdFuncionarios = sc.nextInt();
		System.out.print("");
		

		System.out.print("Qual Faturamento mensal? ");
		double valorFaturamento = sc.nextDouble();
		
		double valorDoImposto;
		
		valorDoImposto = valorFaturamento * (qtdFuncionarios > 10 ? 0.05 : 0.02 );
		
		//? then
		//? else
		System.out.println("Valor do imposto é " + valorDoImposto);
	
	}
		
}
