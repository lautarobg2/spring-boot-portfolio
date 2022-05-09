
package com.portfolio.repository;

import com.portfolio.model.Proyects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProyectsRepository extends JpaRepository<Proyects, Long> {
    
}
