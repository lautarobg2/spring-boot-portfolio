
package com.portfolio.service;

import com.portfolio.model.Skills;
import com.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SkillService implements iSkillService {

    @Autowired
    SkillRepository repository;
    
    @Override
    public List<Skills> obtenerDatosSkills() {
        return repository.findAll();
    }

    @Override
    public Skills obtenerSkill(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Skills crearItemSkill(Skills skill) {
        return repository.save(skill);
    }

    @Override
    public void eliminarItemSkill(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Skills modificarSkill(Skills skill) {
        return repository.save(skill);
    }
    
}
