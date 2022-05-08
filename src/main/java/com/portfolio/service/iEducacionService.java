package com.portfolio.service;

import com.portfolio.model.Educacion;
import java.util.List;


public interface iEducacionService {
    
    public List<Educacion> obtenerDatosEdu();
    
    public Educacion obtenerEdu(Long id);
    
    public Educacion crearItemEdu(Educacion educacion);
    
    public void eliminarItemEdu(Long id);
    
    public Educacion modificarEdu(Educacion educacion);
    
}
