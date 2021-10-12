package exemploPolimorfismo;

public class MySQL implements BancoDeDados{
	
	@Override
	public void conectaNoBanco() {
		if (validaSenha("mySql", "123456")) {
			System.out.println("Conectado com sucesso");
		}else {
			System.out.println("Erro de conecção");
		}
		carregaLibsLongoDB();
	}
	
	public boolean validaSenha(String usuario, String senha) {
		if ("mySql".equals(usuario) && ("admin".equals(123456))) {
			return true;
		}
		return false;
	}
	
	public void carregaLibsLongoDB() {
		System.out.println("Carregou as dlls do banco de dados mongoDB no noSQL");
	}
}
