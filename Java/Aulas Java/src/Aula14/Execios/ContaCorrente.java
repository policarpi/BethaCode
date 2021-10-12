package Aula14.Execios;

public class ContaCorrente implements Taxas {
	
	private final double aliquotaTaxa = 0.05;
	private String correntista;
	private double saldo;
	
	@Override
	public double calculaTaxa() {
		double valorTaxa;
		valorTaxa = this.saldo * aliquotaTaxa;
		
		return valorTaxa;
	}

	public ContaCorrente(String correntista, double saldo) {
		super();
		this.correntista = correntista;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	

	
}
