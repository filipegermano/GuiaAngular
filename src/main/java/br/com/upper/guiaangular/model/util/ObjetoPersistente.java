package br.com.upper.guiaangular.model.util;

import java.io.Serializable;

/**
 *
 * @author filipe
 */
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ObjetoPersistente implements Serializable {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }        
    
}
