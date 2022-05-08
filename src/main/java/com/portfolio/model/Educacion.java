
package com.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Entity
@Component
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String img;
    private String title;
    private String time;
    private String description;

    public Educacion() {
    }

    public Educacion(Long id, String img, String title, String time, String description) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.time = time;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", img=" + img + ", title=" + title + ", time=" + time + ", description=" + description + '}';
    }
    
    
    
    
}
