
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
public class Header {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String profile;
    private String nombre;
    private String titulo;
    private String banner;

    public Header() {
    }

    public Header(Long id, String profile, String nombre, String titulo, String banner) {
        this.id = id;
        this.profile = profile;
        this.nombre = nombre;
        this.titulo = titulo;
        this.banner = banner;
    }

    @Override
    public String toString() {
        return "Header{" + "id=" + id + ", profile=" + profile + ", nombre=" + nombre + ", titulo=" + titulo + ", banner=" + banner + '}';
    }
    
    
    
    
}
