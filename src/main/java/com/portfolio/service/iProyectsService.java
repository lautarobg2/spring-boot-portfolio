
package com.portfolio.service;

import com.portfolio.model.Proyects;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public interface iProyectsService {
    
    public List<Proyects> obtenerDatosPro();
    
    public Proyects obtenerPro(@PathVariable Long id);
    
    public Proyects crearItemPro(@RequestBody Proyects proyect);
    
    public void eliminarItemPro(@PathVariable Long id);
    
    public Proyects modificarPro(@RequestBody Proyects proyect);
    
}
