
package com.portfolio.service;

import com.portfolio.model.Proyects;
import com.portfolio.repository.ProyectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectsService implements iProyectsService {
    
    @Autowired
    ProyectsRepository repository;

    @Override
    public List<Proyects> obtenerDatosPro() {
        return repository.findAll();
    }

    @Override
    public Proyects obtenerPro(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Proyects crearItemPro(Proyects proyect) {
        return repository.save(proyect);
    }

    @Override
    public void eliminarItemPro(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Proyects modificarPro(Proyects proyect) {
        return repository.save(proyect);
    }
    
}
