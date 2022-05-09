
package com.portfolio.service;

import com.portfolio.model.About;
import java.util.List;


public interface iAboutService {
    
    public List<About> obtenerDatosAbout();
    
    public About modificarAbout(About about);
    
    
}
