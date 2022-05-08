
package com.portfolio.service;

import com.portfolio.model.Skills;
import java.util.List;

public interface iSkillService {
    
    public List<Skills> obtenerDatosSkills();
    
    public Skills obtenerSkill(Long id);
    
    public Skills crearItemSkill(Skills skill);
    
    public void eliminarItemSkill(Long id);
    
    public Skills modificarSkill(Skills skill);
    
}
