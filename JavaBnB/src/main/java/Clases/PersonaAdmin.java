package Clases;

import java.io.Serializable;


public class PersonaAdmin implements Serializable{

    private String correo;
    private String clave;

    public PersonaAdmin() { 
    }

    public PersonaAdmin(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
//metodos necesarios

    
    
    
}
