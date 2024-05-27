package Clases;

import java.io.Serializable;
import java.util.List;

public class ClienteParticular extends Cliente implements Serializable {

    private boolean vip;
    private TarjetaCrédito tarjetaCrédito;

  



    public ClienteParticular() {    
    }
    
    

    public ClienteParticular(boolean vip, String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave, nombre, dni, telefono);
        this.vip = vip;
    }
    
      /**
     * Get the value of tarjetaCredito
     *
     * @return the value of tarjetaCredito
     */
    public TarjetaCrédito getTarjetaCrédito() {
        return tarjetaCrédito;
    }

    /**
     * Set the value of tarjetaCredito
     *
     * @param tarjetaCredito new value of tarjetaCredito
     */
    public void setTarjetaCrédito(TarjetaCrédito tarjetaCredito) {
        this.tarjetaCrédito = tarjetaCrédito;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    

}
