package br.com.upper.guiaangular.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.upper.guiaangular.model.Diretiva;
import br.com.upper.guiaangular.model.dao.DiretivaDao;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

@Path("/diretiva")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
@RequestScoped
public class DiretivaService {
    
    @Inject
    private DiretivaDao diretivaDao;
    
    @GET
//    @Path("/{id}")
    public Diretiva recupera(@PathParam("id") Long id){
        Diretiva d = new Diretiva();
        d.setDescricao("Descrição");
        d.setDiretiva("diretiva");
        d.setExemplo("Exemplo");
        d.setId(1l);
        return d;
        
//        return diretivaDao.buscaPorId(id);
        
    }        
    
    @GET
    @Path("/todas")
    public List<Diretiva> listaTodoas(){
        List<Diretiva> diretivas = new ArrayList<>();
        diretivas = diretivaDao.listar(Diretiva.LISTA_TODAS);
        return diretivas;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/salvar")
    public Response salvar(Diretiva diretiva) {
        diretivaDao.salvar(diretiva);
        return Response.ok().entity(diretiva).build();
    }

}
