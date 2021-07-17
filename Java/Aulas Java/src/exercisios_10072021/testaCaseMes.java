package exercisios_10072021;

import java.util.Scanner;

public class testaCaseMes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o mês  1 a 12\n1 - Janeiro \n2 - Fevereiro"
				+ "\n3 - Março"
				+ "\n4 - Abril"
				+ "\n5 - Maio"
				+ "\n6 - Junho"
				+ "\n7 - Julho"
				+ "\n8 - Agosto"
				+ "\n9 - Setembro"
				+ "\n10 - Outubro"
				+ "\n11 - Novembro"
				+ "\n12 - Dezembro  ");
		int mes = sc.nextInt();
		System.out.print("");
		
		switch (mes) {
		case 1: {
			System.out.println(mes + " - Janeiro");
			break;
		}
		case 2: {
			System.out.println(mes + " - Fevereiro");
			break;
		}
		case 3: {
			System.out.println(mes + " - Março");
			break;
		}
		case 4: {
			System.out.println(mes + " - Abril");
			break;
		}
		case 5: {
			System.out.println(mes + " - Maio");
			break;
		}
		case 6: {
			System.out.println(mes + " - Junho");
			break;
		}
		case 7: {
			System.out.println(mes + " - Juho");
			break;
		}
		case 8: {
			System.out.println(mes + " - Agosto");
			break;
		}
		case 9: {
			System.out.println(mes + " - Setembro");
			break;
		}
		case 10: {
			System.out.println(mes + " - Outubro");
			break;
		}
		case 11: {
			System.out.println(mes + " - Novembro");
			break;
		}
		case 12: {
			System.out.println(mes + " - Dezembro");
			break;
		}
		default:
			System.out.println("Mes informado invaldo");
			break;
		}
	}
}
