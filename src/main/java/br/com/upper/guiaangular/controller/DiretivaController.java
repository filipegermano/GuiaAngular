package br.com.upper.guiaangular.controller;

import br.com.upper.guiaangular.model.dao.DiretivaDao;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author filipe
 */
@Named
public class DiretivaController { 
    
    @Inject
    private DiretivaDao diretivaDao;

}
