package br.com.unipar.frameworks.model.dao;

import br.com.unipar.frameworks.model.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class GenericDAO<T> {
    
    private static final Logger LOGGER = LogManager.getLogger("br.com.unipar.persistencia");


    private final Class<T> clazz;
    protected EntityManager em;

    public GenericDAO(Class<T> clazz) {
        this.clazz = clazz;
        this.em = EntityManagerUtil.getManager();
    }
    
    public void fechar() {
        em.close();
        System.out.println("entity manager fechada!");
    }

    public T save(T entity) {
        try {
            
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Ops, algo deu errado =( \n" + e);
            //LOGGER.info("Erro: " + e);
        } finally {
            fechar();
        }
      
        return entity;
    }
    
    public T update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        fechar();
        return entity;
    }
    
    public void delete(T entity) {
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
        fechar();
    }

    public T findById(Long id) {
        
        
        
        return em.find(clazz, id);
    }
    
    public List<T> findAll() {
        String jpql = "from " + clazz.getSimpleName();
        TypedQuery<T> query = em.createQuery(jpql, clazz);
        return query.getResultList();
    }
    
    public T mergeEntity(T entity) {

    try {
        em.getTransaction().begin();

        T mergedEntity = em.merge(entity);

        em.getTransaction().commit();

        return mergedEntity;
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        throw e;
    } finally {
        em.close();
    }
}
    
}
