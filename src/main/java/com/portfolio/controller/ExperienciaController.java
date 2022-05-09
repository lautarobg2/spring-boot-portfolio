
package com.portfolio.controller;

import com.portfolio.model.Experiencia;
import com.portfolio.service.ExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    ExperienciaService service;
        
    @GetMapping("/experience")
    @ResponseBody
        public List<Experiencia> obtenerDatosExp(){
            return service.obtenerDatosExp();
    }
    
    @GetMapping("/experience/{id}")
    @ResponseBody
        public Experiencia obtenerExp(@PathVariable Long id){
            return service.obtenerExp(id);
        }
    
    @PostMapping("/experience/create")
        public Experiencia crearItemExp(@RequestBody Experiencia experiencia){
            return service.crearItemExp(experiencia);
        }
        
    @DeleteMapping("/experience/delete/{id}")
        public void eliminarItemExp(@PathVariable Long id){
            service.eliminarItemExp(id);
        }
        
    @PutMapping("/experience/update")
        public Experiencia modificarExp(@RequestBody Experiencia experiencia){
            return service.modificarExp(experiencia);
        }
    
}
