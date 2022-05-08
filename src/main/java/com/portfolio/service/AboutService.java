
package com.portfolio.service;

import com.portfolio.model.About;
import com.portfolio.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AboutService implements iAboutService {
    
    @Autowired
    AboutRepository repository;

    @Override
    public List<About> obtenerDatosAbout() {
        return repository.findAll();
    }

    @Override
    public About modificarAbout(About about) {
        return repository.save(about);
    }
    
}
