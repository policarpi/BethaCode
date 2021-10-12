package Aula14;

public class CriadorDeUsuarios {
	public static void main(String[] args) {
		
	
		Administrador admin = new Administrador();
		if(admin.definirSenha("Tiago1234")) {
			System.out.println("Senha alterada com sucesso!!!!");
		}else {
			System.out.println("Senha não contempla requisitos mínimos (8 caracteres)");
		}
		
		DemaisUsaurios operacao = new DemaisUsaurios();
		if(operacao.definirSenha("123TESTE")) {
			System.out.println("Senha alterada com sucesso!!!!");
		}else {
			System.out.println("Senha não contempla requisitos mínimos (4 caracteres)");
		}

	}
}