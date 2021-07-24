package exercicios_17072021;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class fabricaAnimal {
	public static void main(String[] args) throws IOException, InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Animal> list = new ArrayList<>();

		int menu = 1;
		do {
	
			System.out.println("O que você deseja fazer com os animais\n" + "1 - Mostrar Animal \n" + "2 - dormir  \n"
					+ "3 - Amimentar \n"
					+ "4 - Cadastrar animal \n"
					+ "0 - para sair \n");
			int opt = sc.nextInt();
		
		
	
		switch (opt) {
		case 1:
			for (Animal animal : list) {
				System.out.println(animal.getName());
			}
			break;
		case 2:
			for (Animal animal : list) {
			}
			break;
		case 3:
			System.out.println("Qual animal? ");
			int j = sc.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (list.size() == j) {
					System.out.println(list.get(j));
				} else if (j > list.size()) {
					System.err.println("Valor acima do tamanho da lista");
				} else {
					System.out.println("Animal não encontrado");
				}
			}
			break;
		case 4:
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
			break;
		default:
			return;
		}
	    if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

		} while(menu !=0);
			
		System.out.println("-------");
		System.out.println("-------");
		System.out.println("-------");

		/// ve dados final
		for (Animal animal : list) {
			System.out.println(animal.toString());
		}
	
}}
