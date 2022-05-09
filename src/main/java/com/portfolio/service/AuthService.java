
package com.portfolio.service;

import com.portfolio.model.User;
import com.portfolio.model.dto.UserDto;
import com.portfolio.repository.AuthRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthService implements iAuthService {
    
    @Autowired
    AuthRepository repository;
    
    @Autowired
    PasswordEncoder passEncoder;
    
    public boolean isUserEnabled(UserDto userDto){
        boolean isUserEnabled = false;
        List<User> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if(!usuarios.isEmpty()){
            User usuario = usuarios.get(0);
                if(passEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                    isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
    public void crearUser(User user) throws Exception{
        List<User> users = repository.findByEmailAndIsEnabledTrue(user.getEmail());
        if(!users.isEmpty()){
            throw new Exception("El email ingresado ya esta registrado");
        } else {
        user.setPassword(passEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        repository.save(user);
        }
    }

    public List<User> obtenerDatosUser() {
        return repository.findAll();
    }
    
}
