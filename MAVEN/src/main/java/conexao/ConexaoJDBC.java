package conexao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoJDBC {

    public static Properties getProp() throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream file = loader.getResourceAsStream("config.properties");
        props.load(file);
        return props;

    }
    public static Connection getConnection() {
        //URI conexão bando de dados
        //String urlDeConexao = "jdbc:postgresql://localhost/BethaCodeAlunos";
        //String usuario = "postgres";
        //String senha = "30032012";
        Connection minhaConexao = null;
        try {
            Properties props = getProp();
            String urlDeConexao = props.getProperty("dados.url");
            String usuario = props.getProperty("dados.usuario");
            String senha = props.getProperty("dados.senha");
            minhaConexao = DriverManager.getConnection(urlDeConexao, usuario, senha);
            System.out.println("Conectado");
            } catch (SQLException e) {
                    System.out.println("Náo conetado: " + e.getMessage());
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("Erro de leitura arquivos" + e.getMessage());
                    e.printStackTrace();
                }
        return minhaConexao;
    }


}
