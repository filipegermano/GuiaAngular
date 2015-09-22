package br.com.upper.guiaangular.model.dao;

import br.com.upper.guiaangular.model.Diretiva;
import javax.inject.Named;

//@Named
public class DiretivaDao extends Dao<Diretiva> {    

    public DiretivaDao() {
        super(Diretiva.class);
    }

}
