package Aula14;

public class DemaisUsaurios implements Usuarios {
	
	@Override
	public boolean definirSenha(String senha) {
		if(senha.trim().length() < 4) {
			return false; 
		}
		return true;
	}


}
