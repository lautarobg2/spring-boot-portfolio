
package com.portfolio.controller;

import com.portfolio.model.About;
import com.portfolio.service.AboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AboutController {
    
    @Autowired
    AboutService service;
    
    @GetMapping("/about")
    @ResponseBody
    public List<About> obtenerDatosAbout(){
        return service.obtenerDatosAbout();
    }
    
    @PutMapping("/about/update")
    public About modificarAbout(@RequestBody About about){
        return service.modificarAbout(about);
    }
    
}
