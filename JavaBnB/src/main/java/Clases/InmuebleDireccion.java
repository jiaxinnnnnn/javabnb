package Clases;

public class InmuebleDireccion {

    private String calle;
    private String codigoPostal;
    private String ciudad;

    public InmuebleDireccion() {
    }

    public InmuebleDireccion(String calle, String codigoPostal, String ciudad) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
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
