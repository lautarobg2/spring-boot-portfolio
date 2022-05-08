
package com.portfolio.controller;

import com.portfolio.model.User;
import com.portfolio.model.dto.UserDto;
import com.portfolio.service.AuthService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
    
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login (@RequestBody UserDto userDto){
       return service.isUserEnabled(userDto);
    }
    
    @GetMapping("/getuser")
    @ResponseBody
        public List<User> obtenerDatosUser(){
            return service.obtenerDatosUser();
    }
    
    @PostMapping("/register")
    public void register(@RequestBody User user) throws Exception{
        service.crearUser(user);
    }
    
    
}
