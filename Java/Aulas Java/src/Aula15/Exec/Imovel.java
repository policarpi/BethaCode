package Aula15.Exec;

public abstract class Imovel implements Contribuinte {
	
	private String inscri;
	
	public double calculaImposto (double vlaM2 , int M2) {
		return vlaM2 * M2;
	}

	public Imovel(String inscri) {
		super();
		this.inscri = inscri;
	}
	
	

}
