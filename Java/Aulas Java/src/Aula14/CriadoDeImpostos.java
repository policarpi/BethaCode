package Aula14;

public class CriadoDeImpostos {
	
	public static void main(String[] args) {
		
		Iptu imovel1 =  new Iptu("PMC", "Neemias casonatto", 80);
		
		System.out.println("Valor do imposto: " + imovel1.calculaImpoto());
		
		System.out.println(imovel1);

		Iss empresa1 = new Iss("PMC", "Betha",10000.0);
		System.out.println(empresa1);
		
		Alvara empresa2 = new Alvara("PMC", "Betha", 10000);
		
		System.out.println(empresa2);
				
		
	}

}
