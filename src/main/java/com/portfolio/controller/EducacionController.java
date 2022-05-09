
package com.portfolio.controller;

import com.portfolio.model.Educacion;
import com.portfolio.service.EducacionService;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class EducacionController {
    
    @Autowired
    EducacionService service;
    
        
    @GetMapping("/education")
    @ResponseBody
        public List<Educacion> obtenerDatosEdu(){
            return service.obtenerDatosEdu();
    }
    
    @GetMapping("/education/{id}")
    @ResponseBody
        public Educacion obtenerEdu(@PathVariable Long id){
            return service.obtenerEdu(id);
        }
    
    @PostMapping("/education/create")
        public Educacion crearItemEdu(@RequestBody Educacion educacion){
            return service.crearItemEdu(educacion);
        }
        
    @DeleteMapping("/education/delete/{id}")
        public void eliminarItemEdu(@PathVariable Long id){
            service.eliminarItemEdu(id);
        }
        
    @PutMapping("/education/update")
        public Educacion modificarEdu(@RequestBody Educacion educacion){
            return service.modificarEdu(educacion);
            
        }
        
    
    
}
