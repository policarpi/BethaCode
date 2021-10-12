package Aula12.Execicos;

public class Conta {
	
	private String correntista;
	protected Double saldo;
	private Integer numeroConta;

	public Conta(){
		
	}
	
	public Conta(Integer numeroConta, String correntista, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.setcorrentista(correntista);
		this.saldo = saldo;
	}


	public Integer getnumeroConta() {
		return numeroConta;
	}

	public void setnumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Double getsaldo() {
		return saldo;
	}


	public void Sacar(double valor) {
		saldo-= valor + 5.0;
		
	}
	public void deposito (double valor) {
		if (valor <= 0) {
			System.out.println("Valor não valido pare depositado");
		}
		saldo += valor;
	}


	public String getcorrentista() {
		return correntista;
	}

	public void setcorrentista(String correntista) {
		this.correntista = correntista;
	}

		
}