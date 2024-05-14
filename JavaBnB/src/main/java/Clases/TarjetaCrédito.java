/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author sgsic
 */
public class TarjetaCrédito {
    
    private String nombre;
    private long número;
    private LocalDate fechaCaducidad;

    public TarjetaCrédito(String nombre, long número, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.número = número;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Get the value of número
     *
     * @return the value of número
     */
    public long getNúmero() {
        return número;
    }

    /**
     * Set the value of número
     *
     * @param número new value of número
     */
    public void setNúmero(long número) {
        this.número = número;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
