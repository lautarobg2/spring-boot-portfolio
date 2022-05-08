
package com.portfolio.service;


import com.portfolio.model.Experiencia;
import com.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ExperienciaService implements iExperienciaService {

    @Autowired
    ExperienciaRepository repository;

    @Override
    public List<Experiencia> obtenerDatosExp() {
        return repository.findAll();
    }

    @Override
    public Experiencia obtenerExp(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Experiencia crearItemExp(Experiencia experiencia) {
        return repository.save(experiencia);
    }

    @Override
    public void eliminarItemExp(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia modificarExp(Experiencia experiencia) {
        return repository.save(experiencia);
    
}

}
