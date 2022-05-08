
package com.portfolio.service;

import com.portfolio.model.User;
import com.portfolio.model.dto.UserDto;
import java.util.List;


public interface iAuthService {
    
    public boolean isUserEnabled(UserDto userDto);
    
     public void crearUser(User user) throws Exception;
     
     public List<User> obtenerDatosUser();
    
}
