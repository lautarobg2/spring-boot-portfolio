
package com.portfolio.controller;


import com.portfolio.model.Skills;
import com.portfolio.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class SkillController {
    
    @Autowired
    SkillService service;
        
    @GetMapping("/skills")
    @ResponseBody
        public List<Skills> obtenerDatosSkills(){
            return service.obtenerDatosSkills();
    }
    
    @GetMapping("/skills/{id}")
    @ResponseBody
        public Skills obtenerSkills(@PathVariable Long id){
            return service.obtenerSkill(id);
        }
    
    @PostMapping("/skills/create")
        public Skills crearItemSkill(@RequestBody Skills skill){
            return service.crearItemSkill(skill);
        }
        
    @DeleteMapping("/skills/delete/{id}")
        public void eliminarItemSkill(@PathVariable Long id){
            service.eliminarItemSkill(id);
        }
        
    @PutMapping("/skills/update")
        public Skills modificarSkill(@RequestBody Skills skill){
            return service.modificarSkill(skill);
        }
    
}
