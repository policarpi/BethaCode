package exercicio;

import java.util.Scanner;

public class ClassificaEmpresa {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome da empresa :  ");
		String empresa = sc.next();
		System.out.print("");
		
		System.out.print("Qual a quantidade de funcionarios? ");
		int qtdFuncionarios = sc.nextInt();
		System.out.print("");
		
		String mensagemFinal = empresa;
		
			if (qtdFuncionarios < 5) {
				mensagemFinal += " é isenta de impostos";
				}else if (qtdFuncionarios < 20 ) {
					mensagemFinal += " deve pagar 5% sobre o Faturamento.";
						} else {
						mensagemFinal += " deve pagar o valor Fixo de R$ 5.000,00";
						}	
		
			System.out.println(mensagemFinal);
		sc.close();
		}
}