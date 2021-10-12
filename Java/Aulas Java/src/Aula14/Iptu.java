package Aula14;

public class Iptu extends Impostos {
	
	private double areaDoImovel;
	private final double valorDoM2 = 1.50;
	
	public Iptu(String benificiario, String contribuinte, double areaDoImovel) {
		super(benificiario, contribuinte);
		this.areaDoImovel = areaDoImovel;
	}
	
	@Override
	public double calculaImpoto() {
		double meuimposto = this.areaDoImovel * this.valorDoM2;
		this.setValorImposto(meuimposto);
		return meuimposto;
	}

	@Override
	public String toString() {
		return "----------- Cauculode IPTU - 2021 ----------- \n"
				+ "Benificiario:  " + this.getBenificiario() + "\n"
				+ "Contribuinte:  " + this.getContribuinte() + "\n"
				+ "Area ddo imovel: " + this.areaDoImovel + "\n"
				+ "Valor do M2: " + this.valorDoM2 + "\n"
				+ "Area imovel: " +  this.areaDoImovel + "\n"
				+ "Valor do imposto: " + this.calculaImpoto() + "\n"
				+ "--------------------------------------------\n"
				+ "_____________________________________________\n";
			}
	
	

}
