package Clases;

import java.io.Serializable;

public class Cliente extends PersonaAdmin implements Serializable {

    private String nombre;

    private String dni;

    private String telefono;
    
    public Cliente(){}

    public Cliente(String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave);
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    


}
