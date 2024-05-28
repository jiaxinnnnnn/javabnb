package Clases;

import java.util.Date;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteAnfitrion extends Cliente implements Serializable {

    private LocalDate fechaRegistro;
    private boolean superAnfitrion;
    private List<Inmueble> inmuebles;
    
    public ClienteAnfitrion(){
        
    }

    public ClienteAnfitrion(LocalDate fechaRegistro, String correo, String clave, String nombre, String dni, String telefono) {
        super(correo, clave, nombre, dni, telefono);
        this.fechaRegistro = fechaRegistro;
        this.superAnfitrion = false;
        this.inmuebles = new ArrayList<>();
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isSuperAnfitrion() {
        return superAnfitrion;
    }

    public void setSuperAnfitrion(boolean superAnfitrion) {
        this.superAnfitrion = superAnfitrion;
    }
    
    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }
    
    public void addInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
        actualizarSuperAnfitrion();
    }
    
    private void actualizarSuperAnfitrion(){
        double sumaCalificacion = 0;
        int totalCalificaciones = 0;
        for (Inmueble inmueble : inmuebles) {
            sumaCalificacion += inmueble.getCalificacion();
            totalCalificaciones++;
        }
        if (totalCalificaciones > 0) {
            double media = sumaCalificacion / totalCalificaciones;
            superAnfitrion = media > 4;
        }
        else {
            superAnfitrion = false;
        }
    }       
}
        
