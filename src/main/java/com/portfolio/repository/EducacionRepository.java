
package com.portfolio.repository;

import com.portfolio.model.Educacion;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Repository
@Component
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}
