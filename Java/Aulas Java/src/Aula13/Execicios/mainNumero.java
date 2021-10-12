package Aula13.Execicios;


import java.util.ArrayList;
import java.util.List;



public class mainNumero {

	public static void main(String[] args) {
		
		Numeros.numeroPar(10);
		Numeros.numeroPar(123);
		
		
		List <Integer>  ListaASerSomado = new ArrayList<>();
		ListaASerSomado.add(1);
		ListaASerSomado.add(20);
		ListaASerSomado.add(3);
		
		System.out.println(Numeros.somaNumeros(ListaASerSomado));
		
		
		
		List <Integer>  ContaPositiso = new ArrayList<>();
		ContaPositiso.add(10);
		ContaPositiso.add(-1);
		ContaPositiso.add(5);
		
		System.out.println(Numeros.contaPositivos(ContaPositiso));
		
		
		
	}
}
