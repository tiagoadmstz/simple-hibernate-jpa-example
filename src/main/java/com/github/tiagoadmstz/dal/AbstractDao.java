package com.github.tiagoadmstz.dal;

import com.github.tiagoadmstz.factories.EntityManagerFactoryService;

import javax.persistence.EntityManager;

public abstract class AbstractDao<T> {

    public abstract boolean saveOrUpdate(T entity);

    public abstract T findOne(Long id);

    protected EntityManager createEntityManager() {
        return EntityManagerFactoryService.getEntityManagerFactory("H2PU").createEntityManager();
    }

}
