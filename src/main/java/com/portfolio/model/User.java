
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
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    @Basic
    private String nombre;
    private String email;
    private String password;
    private boolean isEnabled;

    public User() {
    }

    public User(Long id, String nombre, String email, String password, boolean isEnabled) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + ", isEnabled=" + isEnabled + '}';
    }
    
    
    
}
