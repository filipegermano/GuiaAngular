package br.com.upper.guiaangular.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

/**
 *
 * @author filipe
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Diretiva.listaTodas", query = "SELECT d FROM Diretiva d")
})
public class Diretiva implements Serializable {
    
    @Transient
    public static final String LISTA_TODAS = "Diretiva.listaTodas";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 80)
    private String diretiva;    
    private String descricao;
    private String exemplo;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDiretiva() {
        return diretiva;
    }

    public void setDiretiva(String diretiva) {
        this.diretiva = diretiva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getExemplo() {
        return exemplo;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;
    }

}
