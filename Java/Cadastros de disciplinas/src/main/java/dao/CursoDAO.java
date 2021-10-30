package dao;

import conexao.ConexaoJDBC;
import modelo.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    private Connection minhaConnection;

    public CursoDAO(){
        this.minhaConnection = ConexaoJDBC.getConnection();
    }

    public void criarCurso(Curso novoCurso){
        try {
            String meuSql = "INSERT INTO curso " +
                    "(descricao, num_creditos, coordenador) " +
                    "VALUES (?,?,?)";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            preparedStatement.setString(1,novoCurso.getDescricao());
            preparedStatement.setInt(2,novoCurso.getNum_creditos());
            preparedStatement.setString(3,novoCurso.getCoordenador());
            int linhaInseriada = preparedStatement.executeUpdate();
            System.out.println("Aluno adcionado!!! Inseriada " + linhaInseriada +
                    "linha(s).");
        }catch (SQLException e){
            System.out.println("Erroooo!!!! nunca seras cavalerio " +
                    "Jedi se não conseguir conectar com um simples Postgres");
        }
    }
    public List<Curso> buscarCurso(){
        List<Curso> cursosCadastrados = new ArrayList<>();
        try{
            String meuSql = "SELECT * FROM curso";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            ResultSet resultadoSql = preparedStatement.executeQuery();
            while (resultadoSql.next()){
                Curso cadastrado = new Curso();
                cadastrado.setI_curso(resultadoSql.getInt("I_curso"));
                cadastrado.setDescricao(resultadoSql.getString("descricao"));
                cadastrado.setNum_creditos(resultadoSql.getInt("num_creditos"));
                cadastrado.setCoordenador(resultadoSql.getString("coordenador"));
                cursosCadastrados.add(cadastrado);
            }
        }catch (SQLException e){
            System.out.println("Erroooo!!!!  ao trazar uma lista de cadastros");
        }
        return cursosCadastrados;
    }
    public Curso buscarCursoPorId(Integer i_curso){
        Curso cursosCadastrados =  new Curso();
        try{
            String meuSql = "SELECT * FROM curso WHERE i_curso = ?";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            preparedStatement.setInt(1,i_curso);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()){
                cursosCadastrados.setI_curso(resultado.getInt("i_curso"));
                cursosCadastrados.setDescricao(resultado.getString("descricao"));
                cursosCadastrados.setNum_creditos(resultado.getInt("num_creditos"));
                cursosCadastrados.setCoordenador(resultado.getString("coordenador"));
             }
        }catch (SQLException e){
            System.out.println("Erroooo!!!!  ao consultar ID");
        }
        return cursosCadastrados;
    }
}
