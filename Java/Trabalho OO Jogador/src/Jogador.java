
public class Jogador {
	
	String nome;
	int forca;
	
	public void chute (){
		if (forca < 10 ) {
			System.out.println("Você não tem força!!!");
			return;
		}else if (forca == 10) {
			System.out.println("Seu ultimo chute considere alimentar " );
		}
		forca = forca - 10;
		System.out.println("Voce chutou para valer e agora voce tem " + forca +  " de força");
	}
	public void soco() {
		if (forca < 5 ) {
			System.out.println("Você não tem força!!!");
			return;
		}else if (forca == 5) {
			System.out.println("Seu ultimo soco considere alimentar " );
		}
		forca = forca + 5;
		System.out.println("Voce deu um soco e gora voce tem " + forca +  " de força");
		
		}
	
	public void beberAgua() {
		forca = forca + 15;
		System.out.println("Bebeu agua, sua força é de: " + forca);
	}
	public void comerPao () {
		forca = forca + 30;
		System.out.println("Comeu pão, sua força é de: " + forca);
	}
	@Override
	public String toString() {
		return "Jogador " + nome + ", forca " + forca + "";
	}
	
}
