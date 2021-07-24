package TrabalhoAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios_17072021.Animal;



public class ProgramaAluno {
	
	public static void main (String args []) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double nota;
	Aluno  a1 = new Aluno();
	
	
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("email: ");
		String email = sc.next();
		System.out.print("Quandatas nota precisa cadastrar");
		int nu = sc.nextInt();
		nota = 0;
				for (int i = 1; i <= nu; i++) {
						System.out.print("nota " + i + " :");
						Double notas = sc.nextDouble();
						nota += notas;
					}
		a1.nome = nome;
		a1.email = email;
		a1.media(nu, nota);
		System.out.println(a1.media);
		
	}
}


	// Aluno a1 =  new Aluno("Neemias","teste","adsdas", null, null,0.00);
//	a1.somaNota(4);
//	a1.somaNota(7);
//	a1.somaNota(8);
//	a1.mediaNotas(3);
	
//	System.out.println(a1.getSomaNota());
//	System.out.println(a1.getMediaNotas());
//	System.out.println(a1.si);
	
	
/*
	List<Pessoa> listP = new ArrayList<>();
	List<Materia> listM = new ArrayList<>();

	
	System.out.println("Para listagem precione L ou C cadastros ");
	String menu = sc.next().toUpperCase();
	if (menu != "C"  || menu != "L" ) {
		System.out.println("Entre com um opção valida!!!");
	} else {

	}
	
	
	System.out.println("para listar alunos cadastrado digite 1 ");
	System.out.println("para listar professores cadastrado digite 2 ");
	System.out.println("para listar alunos cadastrado digite 1 ");
	
	
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
	
	
	*/


