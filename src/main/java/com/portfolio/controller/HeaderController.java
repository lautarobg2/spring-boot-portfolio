
package com.portfolio.controller;

import com.portfolio.model.Header;
import com.portfolio.service.HeaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HeaderController {
    
    @Autowired
    HeaderService service;
    
    @GetMapping("/header")
    @ResponseBody
    public List<Header> obtenerHeaderInfo() {
        return service.obtenerHeaderInfo();
    }

    @PutMapping("/header/update")
    public void modificarHeader(@RequestBody Header header) {
        service.modificarHeader(header);
    }
    
}
