package exercicios_17072021;

public class Animal {
	 String tipo;
	 String nome;
	 boolean alimentado;
	
	public void alimentar() {
		if(alimentado){
			System.out.println(nome + " já esta alimento!!");
		}else {
			alimentado = true;
			System.out.println(nome + "  alimentado");
		}
		return;
	}
	
	public void dormir () {
		if (alimentado) {
			System.out.println(nome + "Alinentado pode dormir");
		}else {
			System.out.println("Voce precisa alimentar antes de dormir");
		}
		return;
	}
	
	public void mostrarAnimal() {
		System.out.println( "Nome: " +nome+ ""
				+ "Tipo : " + tipo
				+ "Alimentado: " + alimentado);
	}
	public String getName() {
		return nome;
	}
	public Animal(String nome,String tipo ) {
		this.nome = nome;
		this.tipo = tipo;
	}
}

