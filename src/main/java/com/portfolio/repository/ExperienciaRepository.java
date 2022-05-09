
package com.portfolio.repository;

import com.portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
