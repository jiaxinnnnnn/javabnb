package Clases;

public class InmuebleServicios {

    private boolean wifi;
    private boolean cocina;
    private boolean ac;
    private boolean zonaTrabajo;
    private boolean aparcamiento;
    private boolean piscina;
    private boolean lavadora;

    public InmuebleServicios() {
    }

    public InmuebleServicios(boolean wifi, boolean cocina, boolean ac, boolean zonaTrabajo, boolean aparcamiento, boolean piscina, boolean lavadora) {
        this.wifi = wifi;
        this.cocina = cocina;
        this.ac = ac;
        this.zonaTrabajo = zonaTrabajo;
        this.aparcamiento = aparcamiento;
        this.piscina = piscina;
        this.lavadora = lavadora;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isCocina() {
        return cocina;
    }

    public void setCocina(boolean cocina) {
        this.cocina = cocina;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isZonaTrabajo() {
        return zonaTrabajo;
    }

    public void setZonaTrabajo(boolean zonaTrabajo) {
        this.zonaTrabajo = zonaTrabajo;
    }

    public boolean isAparcamiento() {
        return aparcamiento;
    }

    public void setAparcamiento(boolean aparcamiento) {
        this.aparcamiento = aparcamiento;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isLavadora() {
        return lavadora;
    }

    public void setLavadora(boolean lavadora) {
        this.lavadora = lavadora;
    }

}
