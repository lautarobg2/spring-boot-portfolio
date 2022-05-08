
package com.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyects {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String img;
    private String title;
    private String description;
    private String link;

    public Proyects() {
    }

    public Proyects(Long id, String img, String title, String descripton, String link) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.description = description;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Proyects{" + "id=" + id + ", img=" + img + ", title=" + title + ", description=" + description + ", link=" + link + '}';
    }
    
    
    
}
