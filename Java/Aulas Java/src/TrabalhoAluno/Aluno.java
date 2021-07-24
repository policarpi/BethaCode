package TrabalhoAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	
	String nome;
	String email;
	Double media;

	public void media(int i, double nota) {
		media = nota / i;
	}
}
