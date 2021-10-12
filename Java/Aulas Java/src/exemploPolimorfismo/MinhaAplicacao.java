package exemploPolimorfismo;
	
public class MinhaAplicacao {
	public static void main(String[] args) {
			System.out.println("Bem vindo a nossa app");
			System.out.println("Conectando ao BD");
			MySQL myBanco= new MySQL();
			Conectabanco(myBanco);
			
		}
	public static void Conectabanco(BancoDeDados meuBanco) {
		meuBanco.conectaNoBanco();
	}
}
