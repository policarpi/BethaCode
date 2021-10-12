package Aula13.Execicios;

import java.util.List;

/*
Criar a classe Numeros.

Esta classe terá o atributo numerosGerados que será incrementada a cada

instância da classe.

Deve ser criado os métodos estáticos, ehPar() que recebe um número e

retorna se o mesmo é par.

somaNumeros(), recebe um array de numeros e retorna a soma.

positivos(), recebe um array e retorna quantos são positivos.

*/

public class Numeros {
	
	
	public static void numeroPar(int numeroInformado) {
		
		if (numeroInformado % 2 == 0) {
			System.out.println(numeroInformado +  "é par");
		}else {
			System.out.println(numeroInformado + "não é par");
		}
		
	}
	
	public static int somaNumeros(List <Integer> meusNumeros) {
		
		int soma = 0;
		
		for (Integer meuNumero : meusNumeros) {
			soma = soma + meuNumero;
			
		}
		
		return soma;

		}
	public static int contaPositivos(List <Integer> meusNumeros) {
		
		int positivo = 0;
		
		for (Integer meuNumero : meusNumeros) {
			
			if (meuNumero > 1) {
			positivo = positivo + meuNumero;
			}
		}
		
		return positivo;

		}

}
