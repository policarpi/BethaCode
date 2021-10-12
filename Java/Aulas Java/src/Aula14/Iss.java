package Aula14;

public class Iss extends Impostos {

	private double valorDeFaturamento;
	private final double aliquota = 0.02;

	public Iss(String benificiario, String contribuinte, double valorDeFaturamento) {
		super(benificiario, contribuinte);
		this.valorDeFaturamento = valorDeFaturamento;
	}
	
	@Override
	public double calculaImpoto() {
		double impostoDeIss = this.valorDeFaturamento * this.aliquota;
		this.setValorImposto(impostoDeIss);
		return impostoDeIss;
	}
	
	public String toString() {
		return "----------- Cauculode ISS - 2021 ----------- \n"
				+ "Benificiario:  " + this.getBenificiario() + "\n"
				+ "Contribuinte:  " + this.getContribuinte() + "\n"
				+ "Valor de faturamento " + this.valorDeFaturamento + "\n"		
				+ "Area da aliquota: " + this.aliquota + "\n"
				+ "Valor do imposto: " + this.calculaImpoto() + "\n"
				+ "---------------------------------------------\n"
				+ "_____________________________________________\n";
			}
	
}
