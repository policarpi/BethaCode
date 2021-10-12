package aplicacao;

import modelo.Cidades;
import modelo.Pessoas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Cidades cidadeFind = entityManager.find(Cidades.class,2);


        Pessoas pesso01 =new Pessoas();

        pesso01.setNome("Bruna2");
        pesso01.setBairro("Rio Maina Cidade2");
        pesso01.setIdade(30);
        pesso01.setNumero("284");
        pesso01.setRua("Jose serafim ferreira");
        pesso01.setCidades(cidadeFind);


        entityManager.getTransaction().begin();
        entityManager.persist(pesso01);
   //     entityManager.persist(cidade1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
