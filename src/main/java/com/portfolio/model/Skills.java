
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
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String title;
    private int porcentaje;
    private String subtitle;
    private String outerStrokeColor;

    public Skills() {
    }

    public Skills(Long id, String title, int porcentaje, String subtitle, String outerStrokeColor) {
        this.id = id;
        this.title = title;
        this.porcentaje = porcentaje;
        this.subtitle = subtitle;
        this.outerStrokeColor = outerStrokeColor;
    }

    @Override
    public String toString() {
        return "Skills{" + "id=" + id + ", title=" + title + ", porcentaje=" + porcentaje + ", subtitle=" + subtitle + ", outerStrokeColor=" + outerStrokeColor + '}';
    }
    
    
    
    
}
