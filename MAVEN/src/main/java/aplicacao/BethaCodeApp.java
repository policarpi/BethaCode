package aplicacao;

import conexao.ConexaoJDBC;
import dao.AlunoDAO;
import modelo.Aluno;
import java.util.*;

import java.sql.Connection;

public class BethaCodeApp {
    public static void main(String[] args) {

        Connection minhaConexao = ConexaoJDBC.getConnection();
       System.out.println("Objeto Conexão: " + minhaConexao);
       AlunoDAO alunoDAO =  new AlunoDAO();

    //    Aluno aluno1 = new Aluno("Neemias",30,"Criciuma", "SC");

    //    alunoDAO.criarAluno(aluno1);
    // Lista todos alunos
        List <Aluno> alunosCadastrados = AlunoDAO.buscarAlunos();
        alunosCadastrados.forEach(aluno -> System.out.println(aluno));

        //    Aluno alunoPorId = AlunoDAO.buscarPorId(1);
         //   System.out.println(alunoPorId);

    }
}
