
package com.elitsoft.proyectoCuestionario_backend.entidades;

/**
 *
 * @author ELITSOFT86
 */
public class JwtResponse {
    
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public JwtResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
