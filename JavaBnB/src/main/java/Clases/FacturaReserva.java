/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author sgsic
 */
public class FacturaReserva {
    
   private Date fechaReserva;
   private Cliente cliente;
   private Inmueble inmueble;
   private LocalDate fechaEntrada;
   private LocalDate fechaSalida;

    public FacturaReserva(Date fechaReserva, Cliente cliente, Inmueble inmueble, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.fechaReserva = fechaReserva;
        this.cliente = cliente;
        this.inmueble = inmueble;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
   
   

    /**
     * Get the value of fechaSalida
     *
     * @return the value of fechaSalida
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Set the value of fechaSalida
     *
     * @param fechaSalida new value of fechaSalida
     */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    /**
     * Get the value of fechaEntrada
     *
     * @return the value of fechaEntrada
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Set the value of fechaEntrada
     *
     * @param fechaEntrada new value of fechaEntrada
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    /**
     * Get the value of inmueble
     *
     * @return the value of inmueble
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

 
    /**
     * Get the value of fechaReserva
     *
     * @return the value of fechaReserva
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Set the value of fechaReserva
     *
     * @param fechaReserva new value of fechaReserva
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    
}
