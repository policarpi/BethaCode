package Aula12.Execicos;



public class ContaCorrente  extends Conta{
	
	private Double limiteEmprestimo;
	
	public ContaCorrente() {
		super();
	}
	


	public ContaCorrente(Integer numero, String correntista, Double saldo, Double limiteEmprestimo) {
		super(numero, correntista, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getlimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setlimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void limite(double valor) {
		if(valor<=limiteEmprestimo) {
			saldo +=valor -10.00;
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		saldo-= 2.0 ;
		
	}
	
}