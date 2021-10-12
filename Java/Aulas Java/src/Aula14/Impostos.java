package Aula14;

public abstract class Impostos {
	
	private String benificiario;
	private String contribuinte;
	private double valorImposto;
	
	public Impostos(String benificiario, String contribuinte) {
		super();
		this.benificiario = benificiario;
		this.contribuinte = contribuinte;
	}
	
	abstract public double calculaImpoto();

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public String getBenificiario() {
		return benificiario;
	}

	public String getContribuinte() {
		return contribuinte;
	}
	
	
	

}
