
package com.portfolio.service;


import com.portfolio.model.Experiencia;
import java.util.List;


public interface iExperienciaService {
    
    public List<Experiencia> obtenerDatosExp();
    
    public Experiencia obtenerExp(Long id);
    
    public Experiencia crearItemExp(Experiencia experiencia);
    
    public void eliminarItemExp(Long id);
    
    public Experiencia modificarExp(Experiencia experiencia);
    
}
