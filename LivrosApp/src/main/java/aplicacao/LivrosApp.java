package aplicacao;

import modelo.Livro;
import modelo.Tipo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class LivrosApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Tipo tipoCadastrado = entityManager.find(Tipo.class,2);

        Livro livro1 = new Livro();
        livro1.setAutor("Neemias");
        livro1.setTitulo("Como Desctruir nio JAVA");
        livro1.setTipo(tipoCadastrado);

        entityManager.getTransaction().begin();
        entityManager.persist(livro1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        /* Excluir
        Tipo tipoExcluir=  entityManager.find(Tipo.class,3);
        entityManager.getTransaction().begin();
        entityManager.remove(tipoExcluir);
*/

        /* updade SQL
        Tipo tipoCadastrado =  entityManager.find(Tipo.class,1);
        tipoCadastrado.setDescricao("Romance Saltless");
        entityManager.getTransaction().begin();
        entityManager.persist(tipoCadastrado);
        entityManager.getTransaction().commit();
*/



        /* Selecionar no banco de dados.
        Tipo tipoCadastrado =  entityManager.find(Tipo.class,2);
        System.out.println(tipoCadastrado);
*/

/*Inserção de dados
        Tipo tipo001 = new Tipo();
        tipo001.setDescricao("Romance");

        Tipo tipo002 = new Tipo();
        tipo002.setDescricao("História");

        Tipo tipo003 = new Tipo();
        tipo003.setDescricao("Bigrafia");

        entityManager.getTransaction().begin();
        entityManager.persist(tipo001);
        entityManager.persist(tipo002);
        entityManager.persist(tipo003);

        entityManager.getTransaction().commit();

        System.out.println(tipo001);
        System.out.println(tipo002);
        System.out.println(tipo003);

        entityManager.close();
        entityManagerFactory.close();
*/


    }
}
