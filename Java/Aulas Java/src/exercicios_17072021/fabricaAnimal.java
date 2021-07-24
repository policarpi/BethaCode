package exercicios_17072021;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class fabricaAnimal {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Animal> list = new ArrayList<>();

		System.out.print("Entre a quantidade de Animal a cadastrar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Animal " + i);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Tipo: ");
			String tipo = sc.next();
			list.add(new Animal(nome, tipo));

		}
		// for (Animal animal : list) {
		// System.out.println(animal.getName());
		// }
		System.out.println("O que você deseja fazer com os animais\n" + "1 - Mostrar Animal \n" + "2 - dormir  \n"
				+ "3 - Amimentar \n");
		System.out.println("Qual animal? ");
		int qnan = sc.nextInt();
		
		int opt = sc.nextInt();
		
		switch (opt) {
		case 1:
			for (Animal animal : list) {
				System.out.println(animal.getName());
			}
			break;
		case 2:
			for (Animal animal : list) {
				if(list.equals(qnan)) {
					animal.dormir();
				}
			}
			break;
		case 3:
			for (Animal animal : list) {
				animal.alimentar();
			}
			break;
		default:
			break;
		}

		System.out.println("-------");
		System.out.println("-------");
		System.out.println("-------");

		/// ve dados final
		for (Animal animal : list) {
			System.out.println(animal.getName());
		}

	}

}
