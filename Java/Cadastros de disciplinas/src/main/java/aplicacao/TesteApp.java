package aplicacao;

import dao.CursoDAO;
import dao.DisciplicaDAO;
import modelo.Curso;
import modelo.Disciplina;

import java.util.List;

public class TesteApp {
    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();
        DisciplicaDAO disciplicaDAO = new DisciplicaDAO();

        Curso novoCurso = new Curso("NodesJS", 4, "Tiago");
        cursoDAO.criarCurso(novoCurso);
        Disciplina novaDisciplina = new Disciplina("BackEND", 4, 1);
        disciplicaDAO.criarDisciplina(novaDisciplina);

        List<Curso> cursosCadastrados = cursoDAO.buscarCurso();
        cursosCadastrados.forEach(curso -> System.out.println(curso));

        List<Disciplina> disciplinasCadastradas = disciplicaDAO.buscarDisciplina();
        disciplinasCadastradas.forEach(disciplina -> System.out.println(disciplina));

        Disciplina disciplinaCadastradasID = disciplicaDAO.buscarCursoPorId(1);
        System.out.println(disciplinaCadastradasID);

        Curso cursoID = cursoDAO.buscarCursoPorId(1);
        System.out.println(cursoID);

    }
}
