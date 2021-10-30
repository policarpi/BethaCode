package dao;

import conexao.ConexaoJDBC;
import modelo.Disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplicaDAO {

    private Connection minhaConnection;

    public DisciplicaDAO(){
        this.minhaConnection = ConexaoJDBC.getConnection();
    }

    public void criarDisciplina(Disciplina novaDisciplina){
        try {
            String meuSql = "INSERT INTO disciplina " +
                    "(descricao, num_creditos, id_curso) " +
                    "VALUES (?,?,?)";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            preparedStatement.setString(1,novaDisciplina.getDescricao());
            preparedStatement.setInt(2,novaDisciplina.getNum_creditos());
            preparedStatement.setInt(3,novaDisciplina.getId_curso());
            int linhaInseriada = preparedStatement.executeUpdate();
            System.out.println("Aluno adcionado!!! Inseriada " + linhaInseriada +
                    "linha(s).");
        }catch (SQLException e){
            System.out.println("Erroooo!!!! nunca seras cavalerio " +
                    "Jedi se não conseguir conectar com um simples Postgres");
        }
    }
    public List<Disciplina> buscarDisciplina(){
        List<Disciplina> disciplinasCadastrados = new ArrayList<>();
        try{
            String meuSql = "SELECT * FROM disciplina";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            ResultSet resultadoSql = preparedStatement.executeQuery();
            while (resultadoSql.next()){
                Disciplina cadastrada = new Disciplina();
                cadastrada.setI_disciplina(resultadoSql.getInt("i_disciplina"));
                cadastrada.setDescricao(resultadoSql.getString("descricao"));
                cadastrada.setNum_creditos(resultadoSql.getInt("id_curso"));
                disciplinasCadastrados.add(cadastrada);
            }
        }catch (SQLException e){
            System.out.println("Erroooo!!!!  ao trazar uma lista de cadastros");
        }
        return disciplinasCadastrados;
    }
    public Disciplina buscarCursoPorId(Integer i_curso){
        Disciplina disciplinasCadastradas =  new Disciplina();
        try{
            String meuSql = "SELECT * FROM curso WHERE i_curso = ?";
            PreparedStatement preparedStatement = minhaConnection.prepareStatement(meuSql);
            preparedStatement.setInt(1,i_curso);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()){
                disciplinasCadastradas.setI_disciplina(resultado.getInt("i_disciplina"));
                disciplinasCadastradas.setDescricao(resultado.getString("descricao"));
                disciplinasCadastradas.setNum_creditos(resultado.getInt("num_creditos"));
                disciplinasCadastradas.setId_curso(resultado.getInt("id_curso"));
            }
        }catch (SQLException e){
            System.out.println("Erroooo!!!!  ao consultar ID");
        }
        return disciplinasCadastradas;
    }
}
