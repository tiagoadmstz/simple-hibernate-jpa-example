package com.github.tiagoadmstz;

import com.github.tiagoadmstz.dal.PessoaDao;
import com.github.tiagoadmstz.dal.UsuarioDao;
import com.github.tiagoadmstz.models.Pessoa;
import com.github.tiagoadmstz.models.Usuario;

import java.util.Calendar;

public class JpaExampleApplication {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(1L, "admin", "admin");
        PessoaDao pessoaDao = new PessoaDao();
        new UsuarioDao().saveOrUpdate(usuario);
        pessoaDao.saveOrUpdate(Pessoa.builder()
                .altura(1.8)
                .dataNascimento(Calendar.getInstance())
                .nome("JOÃO PAULO")
                .sexo("MASCULINHO")
                .usuario(usuario)
                .build());
        System.out.println(pessoaDao.findOne(1L));
    }

}
