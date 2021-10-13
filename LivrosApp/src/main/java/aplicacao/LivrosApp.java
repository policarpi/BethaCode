package aplicacao;

import modelo.Livro;
import modelo.Tipo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class LivrosApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Query minhaQuery = entityManager.createQuery("select l from Livro l where l.tipo.id = :idTipo and l.anoPublicacao < :ano");
        minhaQuery.setParameter("idTipo", 2);
        minhaQuery.setParameter("ano",2020);

        List<Livro> meusLivros = minhaQuery.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));



//        Tipo tipoCadastrado = entityManager.find(Tipo.class,2);


//          Query minhaQuery = entityManager.createQuery("select l from Livro l");
//         List<Livro> meusLivros =  minhaQuery.getResultList();
//          meusLivros.forEach(livro -> System.out.println(livro));

//          Query minhQuery1 = entityManager.createQuery("select l.titulo from Livro l");
//          List<String> meusLivrosT =  minhQuery1.getResultList();
//          meusLivrosT.forEach(livro1 -> System.out.println(livro1));

//          Query minhaQuery2 = entityManager.createQuery("select l.anoPublicacao from Livro l");
//          List<Integer> meusLivrosI = minhaQuery2.getResultList();
//          meusLivrosI.forEach(livroI -> System.out.println(livroI));

//          Query minhaQuery3 = entityManager.createQuery("select l from Livro l where l.anoPublicacao > 2000");
//          List<Livro> meusLivrosL = minhaQuery3.getResultList();
//          meusLivrosL.forEach(livro -> System.out.println(livro));

//          Query minhaQuery4 = entityManager.createQuery("select l from Livro l where l.tipo.id = 2");
//          List<Livro> meusLivrosId = minhaQuery4.getResultList();
//          meusLivrosId.forEach(livro -> System.out.println(livro));



        /*    Tipo tipoRomance = entityManager.find(Tipo.class, 1);
        Tipo tipoHisoria = entityManager.find(Tipo.class, 2);


        Livro livro1 = new Livro("Senhos dos aneis","JRRR",tipoHisoria,1543);
        Livro livro2 = new Livro("Fortaleza digital", "Dam Borw",tipoRomance,2008);
        Livro livro3 = new Livro("A Amante de lady","Desconhecido",tipoRomance,1570);


        entityManager.getTransaction().begin();
        entityManager.persist(livro1);
        entityManager.persist(livro2);
        entityManager.persist(livro3);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

*/
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
