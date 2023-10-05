
package com.elitsoft.proyectoCuestionario_backend.entidades;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author ELITSOFT86
 */
public class Authority implements GrantedAuthority {
    
    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
    
    
    
}
