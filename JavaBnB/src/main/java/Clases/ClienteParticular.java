package Clases;

import java.io.Serializable;
import java.util.List;

public class ClienteParticular extends Cliente implements Serializable {

    private boolean vip;


    public ClienteParticular() {    
    }
    
    

    public ClienteParticular(boolean vip, String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave, nombre, dni, telefono);
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    

}
