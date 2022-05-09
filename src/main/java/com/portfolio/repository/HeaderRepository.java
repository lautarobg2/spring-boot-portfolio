
package com.portfolio.repository;


import com.portfolio.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface HeaderRepository extends JpaRepository<Header, Header> {
    
}
