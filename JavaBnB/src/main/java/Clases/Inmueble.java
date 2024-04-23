package Clases;

import java.awt.Image;

public class Inmueble {

    private String titulo;
    private double precio;
    //private Image foto;
    //private int calificacion;
    private boolean casa;
    private boolean apartamento;
    private InmuebleDireccion direccion;
    private InmuebleDatos datos;
    private InmuebleServicios servicios;

    public Inmueble() {
    }

    public Inmueble(String titulo, double precio, boolean casa, boolean apartamento, InmuebleDireccion direccion,InmuebleDatos datos ) {
        this.titulo = titulo;
        this.precio = precio;
        //this.foto = foto;
        //this.calificacion = calificacion;
        this.casa = casa;
        this.apartamento = apartamento;
        this.direccion = direccion;
        this.datos = datos;
        this.servicios = servicios;
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
    
    //metodo de 
    

}
