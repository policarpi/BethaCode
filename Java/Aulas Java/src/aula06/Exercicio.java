package aula06;

import java.util.Scanner;

public class Exercicio {
	
	public static void main (String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome da Rua: ");
		String rua = sc.next();
		System.out.print("");
		System.out.print("Digite o comprimento da rua  em KM ");

		double tamanhoRuaKM = sc.nextDouble();
		double ruaEmMetro = tamanhoRuaKM * 100;
		
		System.out.println(rua + " tem  " + tamanhoRuaKM + " KM sendo em metros "
				+ ruaEmMetro + "m");
		sc.close();
	}

}
