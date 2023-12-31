package br.com.unipar.frameworks.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    PetDoguiLog log = new PetDoguiLog();

    private static EntityManagerFactory emf; //uma vez só durante toda a aplicação
    private static EntityManager em; //cada requisição

    private EntityManagerUtil() {
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.
                    createEntityManagerFactory("HibernateMaven");
            System.out.println("entity manager aberta");
        }
        return emf;
    }

    public static EntityManager getManager() {
        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
            System.out.println("entity manager aberta");
        }
        return em;
    }

    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
            System.out.println("conexão fechada");
        }
    }
}
