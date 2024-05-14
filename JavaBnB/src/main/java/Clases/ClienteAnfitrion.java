package Clases;

import java.util.Date;
import java.io.Serializable;

public class ClienteAnfitrion extends Cliente implements Serializable {

    private Date fechaRegistro;
    private boolean superanfitrion;

    public ClienteAnfitrion(Date fechaRegistro, boolean superanfitrion, String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave, nombre, dni, telefono);
        this.fechaRegistro = fechaRegistro;
        this.superanfitrion = superanfitrion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFecha(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }

}
