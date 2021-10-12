package exemploPolimorfismo;

public class Oracle  implements BancoDeDados{
	
	@Override
	public void conectaNoBanco() {
		if (validaSenha("admin", "admin")) {
			System.out.println("Conectado com sucesso");
		}else {
			System.out.println("Erro de conecção");
		}
	}
	
	public boolean validaSenha(String usuario, String senha) {
		if ("admin".equals(usuario) && ("admin".equals(senha))) {
			return true;
		}
		return false;
		
	}

}
