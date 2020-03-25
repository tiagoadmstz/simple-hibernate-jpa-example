package com.github.tiagoadmstz.dal;

import com.github.tiagoadmstz.models.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class PessoaDao extends AbstractDao<Pessoa> {

    @Override
    public Pessoa findOne(Long id) {
        try {
            EntityManager entityManager = createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            TypedQuery<Pessoa> namedQuery = entityManager.createNamedQuery("Pessoa.findOne", Pessoa.class);
            namedQuery.setParameter("id", id);
            Pessoa singleResult = namedQuery.getSingleResult();
            entityManager.close();
            return singleResult;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveOrUpdate(Pessoa pessoa) {
        try {
            EntityManager entityManager = createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            if (pessoa.getId() == null) entityManager.persist(pessoa);
            else entityManager.merge(pessoa);
            transaction.commit();
            entityManager.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
