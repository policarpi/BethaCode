package Aula12.Execicos;


public  class ContaPoupanca extends Conta {
	
	private Double taxaRendimeto;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numero, String correntista, Double saldo, Double limiteEmprestimo) {
		super(numero, correntista, saldo);
		this.taxaRendimeto = taxaRendimeto;
	}

	public Double gettaxaRendimeto() {
		return taxaRendimeto;
	}

	public void settaxaRendimeto(Double taxaRendimeto) {
		this.taxaRendimeto = taxaRendimeto;
	}
	
	public void updatesaldo() {
		
		saldo += saldo * taxaRendimeto;
		
	}
	
	public  void sacar(double valor) {
		saldo-= valor ;
		
	}

}   