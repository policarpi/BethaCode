package dao;

import conexao.ConexaoJDBC;
import modelo.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class AlunoDAO {
    private Connection minhaConnection;

    public AlunoDAO (){
        this.minhaConnection = ConexaoJDBC.getConnection();
    }
    public void criarAluno(Aluno novoAluno) {
        try {
            String meuSQL = "insert into aluno (nome, idade, cidade, estado) " +
                    "values (?,?,?,?)";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSQL);
            preparedStatement.setString(1, novoAluno.getNome());
            preparedStatement.setInt(2, novoAluno.getIdade());
            preparedStatement.setString(3, novoAluno.getCidade());
            preparedStatement.setString(4, novoAluno.getEstado());

            int linhaInserida = preparedStatement.executeUpdate();
            System.out.println("Adicionado novo aluno!! linhas inseridas: " + linhaInserida);
        } catch (SQLException e) {
            System.out.println("Erro ao persistir os dados ");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
        }
    }

        public  List<Aluno> buscarAlunos (){
            List<Aluno> alunosCadastrados =  new ArrayList<>();
            try{
                String meuSQL = "SELECT * FROM aluno";
                PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSQL);
                ResultSet resultadoSql = preparedStatement.executeQuery();
                while (resultadoSql.next()){
                    Aluno cadastrado = new Aluno();
                    cadastrado.setId(resultadoSql.getInt("id"));
                    cadastrado.setNome(resultadoSql.getString("nome"));
                    cadastrado.setIdade(resultadoSql.getInt("idade"));
                    cadastrado.setCidade(resultadoSql.getString("cidade"));
                    cadastrado.setEstado(resultadoSql.getString("estado"));
                    alunosCadastrados.add(cadastrado);
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
            return alunosCadastrados;
        }

        public Aluno buscarPorId(int id){
            Aluno alunoCadastrado = new Aluno();
            String meuSql = "SELECT * FRON aluno WEHRE id = ?";
            try {
                PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
                preparedStatement.setInt(1,id);
                ResultSet resultado = preparedStatement.executeQuery();
                if (resultado.next()){
                    alunoCadastrado.setId(resultado.getInt("id"));
                    alunoCadastrado.setEstado(resultado.getString("estado"));
                    alunoCadastrado.setNome(resultado.getString("nome"));
                    alunoCadastrado.setIdade(resultado.getInt("idade"));
                    alunoCadastrado.setCidade(resultado.getString("cidade"));

                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
            return alunoCadastrado;
        }
    }
}
