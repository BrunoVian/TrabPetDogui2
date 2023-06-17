package br.com.unipar.frameworks.model.dao;

import br.com.unipar.frameworks.model.util.EntityManagerUtil;
import br.com.unipar.frameworks.model.util.PetDoguiLog;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


public abstract class GenericDAO<T> {

    PetDoguiLog log = new PetDoguiLog();

    private final Class<T> clazz;
    protected EntityManager em;

    public GenericDAO(Class<T> clazz) {
        this.clazz = clazz;
        this.em = EntityManagerUtil.getManager();
    }

    public void fechar() {
        em.close();
        System.out.println("Entity Manager Fechada!");
    }

    public T save(T entity) {
        try {

            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            log.infoPersistencia("Salvo! + ", entity.getClass().getName());
        } catch (Exception e) {
            log.erroPersistencia(e);
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
        log.infoPersistencia("Alterado! + ", entity.getClass().getName());
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
            log.infoPersistencia("Merge! + ", entity.getClass().getName());

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
