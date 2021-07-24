package aula07;

import java.util.Scanner;

public class TestaWhile {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroInformado,maiorNumero  = 0;
		String numerosInformados = "";
		
		
		do {
			System.out.print("Informe um numero qualquer ");
			numeroInformado = sc.nextInt();
				if (numeroInformado > maiorNumero) {
					 maiorNumero = numeroInformado;
				}
					if(numerosInformados.trim() != "") {
						numerosInformados += ",";
					}
						numerosInformados += numeroInformado;
						
		} while (numeroInformado != 0);
		
		System.out.println(numerosInformados);
		System.out.println("----------------------");
		System.out.println("- Maior nomero : "+ maiorNumero + " -");
		System.out.println("----------------------");
		
		sc.close();	
	}

}
