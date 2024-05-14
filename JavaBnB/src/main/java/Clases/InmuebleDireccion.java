package Clases;

public class InmuebleDireccion {

    private String calle;
    private String codigoPostal;
    private String ciudad;
    private int número;

    public InmuebleDireccion() {
    }

    public InmuebleDireccion(String calle, String codigoPostal, String ciudad, int número) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.número = número;
    }
    
     public int getNúmero(){
        return número;
    }
     
    public void setNúmero(int número) {
        this.número = número;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
