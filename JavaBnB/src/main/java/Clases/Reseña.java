/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sgsic
 */
public class Reseña {
    
    private int nota;

    public Reseña(int nota) {
        if (nota < 0 && nota > 5){
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
        this.nota = nota;
    }
    
    /**
     * Get the value of nota
     *
     * @return the value of nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Set the value of nota
     *
     * @param nota new value of nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

}
