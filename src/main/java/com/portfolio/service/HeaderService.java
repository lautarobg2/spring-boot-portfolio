
package com.portfolio.service;

import com.portfolio.model.Header;
import com.portfolio.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class HeaderService implements iHeaderService {

    @Autowired
    HeaderRepository repository;
    
    @Override
    public List<Header> obtenerHeaderInfo() {
        return repository.findAll();
    }

    @Override
    public void modificarHeader(Header header) {
        repository.save(header);
    }
    
}
