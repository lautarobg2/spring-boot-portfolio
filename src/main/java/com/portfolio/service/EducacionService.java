
package com.portfolio.service;

import com.portfolio.model.Educacion;
import com.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EducacionService implements iEducacionService {

    @Autowired
    EducacionRepository repository;
    
    @Override
    public List<Educacion> obtenerDatosEdu() {
        return repository.findAll();
    }

    @Override
    public Educacion obtenerEdu(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Educacion crearItemEdu(Educacion educacion) {
        return repository.save(educacion);
    }

    @Override
    public void eliminarItemEdu(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Educacion modificarEdu(Educacion educacion) {
        return repository.save(educacion);
    }
    
}
