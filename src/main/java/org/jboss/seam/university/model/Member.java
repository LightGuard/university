package org.jboss.seam.university.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents a member of the site
 * 
 * @author Shane Bryzak
 *
 */
@Entity
public class Member implements Serializable {
    private static final long serialVersionUID = -961827892899668203L;
    
    @Id @GeneratedValue private Long id;
    private String firstName;
    private String lastName;
    private String email;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
}
