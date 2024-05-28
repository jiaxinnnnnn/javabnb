package Clases;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Inmueble {

    private String titulo;
    private double precio;
    //private Image foto;
    private boolean casa;
    private boolean apartamento;
    private InmuebleDireccion direccion;
    private InmuebleDatos datos;
    private InmuebleServicios servicios;
    private List<Reseña> reseñas;
    private double calificacion;
    private double precioNoche;
     
      public Inmueble() {
    }
     
      public Inmueble(String titulo, double precio, boolean casa, boolean apartamento, InmuebleDireccion direccion,InmuebleDatos datos ) {
        this.titulo = titulo;
        this.precio = precio;
        //this.foto = foto;
        this.calificacion = 0;
        this.casa = casa;
        this.apartamento = apartamento;
        this.direccion = direccion;
        this.datos = datos;
        this.servicios = servicios;
        this.reseñas = new ArrayList<>();
        
    }
    
    /**
     * Get the value of precioNoche
     *
     * @return the value of precioNoche
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Set the value of precioNoche
     *
     * @param precioNoche new value of precioNoche
     */
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }



    /**
     * Get the value of calificacion
     *
     * @return the value of calificacion
     */
    public double getCalificacion() {
        double sumaReseñas = 0;
        int totalReseñas = 0;
        for (Reseña reseña : reseñas) {
                sumaReseñas += reseña.getNota();
                totalReseñas++;
            }
        if (totalReseñas > 0) {
             calificacion = sumaReseñas / totalReseñas;
        }
        return calificacion;
    }

    /**
     * Set the value of calificacion
     *
     * @param calificacion new value of calificacion
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    

  
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //public Image getFoto() {
    //    return foto;
    //}

    //public void setFoto(Image foto) {
    //    this.foto = foto;
    //}

    //public int getCalificacion() {
    //    return calificacion;
    //}

    //public void setCalificacion(int calificacion) {
    //    this.calificacion = calificacion;
    //}

    public boolean isCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public boolean isApartamento() {
        return apartamento;
    }

    public void setApartamento(boolean apartamento) {
        this.apartamento = apartamento;
    }

    public InmuebleDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(InmuebleDireccion direccion) {
        this.direccion = direccion;
    }

    public InmuebleDatos getDatos() {
        return datos;
    }

    public void setDatos(InmuebleDatos datos) {
        this.datos = datos;
    }

    public InmuebleServicios getServicios() {
        return servicios;
    }

    public void setServicios(InmuebleServicios servicios) {
        this.servicios = servicios;
    }
    
    public List<Reseña> getReseñas() {
        return reseñas;
    }
    
    public void addReseña(Reseña reseña) {
        reseñas.add(reseña);
    }
    //metodo de 
    

}
