package Aula14;

public class Alvara  extends Impostos{
	
	private int numeroDeFuncionario;
	private final double valorFixo = 200;
	private final double descontoPorFuncionario = 5;
	
	public Alvara(String benificiario, String contribuinte, int numeroDeFuncionario) {
		super(benificiario, contribuinte);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
	@Override
	public double calculaImpoto() {
		double descontoFuncionarios = this.descontoPorFuncionario * this.numeroDeFuncionario;
		double impostoAlvara = this.valorFixo - descontoFuncionarios;
		
		if (impostoAlvara < 0 ) impostoAlvara = 0;
		
		this.setValorImposto (impostoAlvara);
		return impostoAlvara;
	}
	
	
	public String toString() {
		return "----------- Cauculode ISS - 2021 ----------- \n"
				+ "Benificiario:  " + this.getBenificiario() + "\n"
				+ "Contribuinte:  " + this.getContribuinte() + "\n"
				+ "Numero de funcionarios " + this.numeroDeFuncionario + "\n"		
				+ "Valor do imposto: " + this.calculaImpoto() + "\n"
				+ "---------------------------------------------\n"
				+ "_____________________________________________\n";
			}
	
	
}
