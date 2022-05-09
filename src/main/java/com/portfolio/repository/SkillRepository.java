
package com.portfolio.repository;

import com.portfolio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface SkillRepository extends JpaRepository<Skills, Long> {
    
}
