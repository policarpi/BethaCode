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
        Properties props = new Properties(); // declar o objeto
        InputStream file = loader.getResourceAsStream("config.properties"); //Seta o nome do arquivo das conf
        props.load(file);
        return props;
    }

    public static  java.sql.Connection getConnection() {
        Connection connection = null;
        try {
            Properties prop = getProp();
            String urlDeConexao = prop.getProperty("dados.url");
            String usuario = prop.getProperty("dados.usuario");
            String senha = prop.getProperty("dados.senha");
            connection = DriverManager.getConnection(urlDeConexao, usuario, senha);
            System.out.println("Você se tornou um cavaleiro JEDI!!!! ");
          return connection;

        } catch (SQLException | IOException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Erroooo!!!! nunca seras cavalerio " +
                    "Jedi se não conseguir conectar com um simples Postgres");
            return null;
        }
    }
}
