package com.github.tiagoadmstz.dal;

import com.github.tiagoadmstz.models.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UsuarioDao extends AbstractDao<Usuario> {

    @Override
    public boolean saveOrUpdate(Usuario usuario) {
        try {
            EntityManager entityManager = createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            if (usuario.getId() == null) entityManager.persist(usuario);
            else entityManager.merge(usuario);
            transaction.commit();
            entityManager.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Usuario findOne(Long id) {
        return null;
    }

}
