package Clases;

import java.util.Date;
import java.io.Serializable;

public class ClienteAnfitrion extends Cliente implements Serializable {

    private Date fecha;

    private boolean superanfitrion;

    public ClienteAnfitrion(Date fecha, boolean superanfitrion, String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave, nombre, dni, telefono);
        this.fecha = fecha;
        this.superanfitrion = superanfitrion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }

}
