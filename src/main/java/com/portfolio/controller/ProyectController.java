
package com.portfolio.controller;

import com.portfolio.model.Proyects;
import com.portfolio.service.ProyectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class ProyectController {
    
    @Autowired
    ProyectsService service;
    
        @GetMapping("/proyect")
    @ResponseBody
        public List<Proyects> obtenerDatosPro(){
            return service.obtenerDatosPro();
    }
    
    @GetMapping("/proyect/{id}")
    @ResponseBody
        public Proyects obtenerPro(@PathVariable Long id){
            return service.obtenerPro(id);
        }
    
    @PostMapping("/proyect/create")
        public Proyects crearItemPro(@RequestBody Proyects proyect){
            return service.crearItemPro(proyect);
        }
        
    @DeleteMapping("/proyect/delete/{id}")
        public void eliminarItemPro(@PathVariable Long id){
            service.eliminarItemPro(id);
        }
        
    @PutMapping("/proyect/update")
        public Proyects modificarPro(@RequestBody Proyects proyect){
            return service.modificarPro(proyect);
        }

    
}
