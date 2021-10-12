package Aula14.Execios;

public class CriaConta {
	
	public static void main(String[] args) {
		
		ContaCorrente cc =  new ContaCorrente("Neemias", 100);
		Double valordaTaxa = cc.calculaTaxa();
		ContaPoupanca cp = new ContaPoupanca("Neemias", 50);
		Double valordaTaxacp = cp.calculaTaxa();

		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Taxa: " + valordaTaxa);
		
		
		 
		System.out.println("Saldo: " + cp.getSaldo());
		System.out.println("Taxa: " + valordaTaxacp);
		
			
	}

}
