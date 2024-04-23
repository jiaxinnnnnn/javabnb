package Clases;

public class InmuebleDatos {

    private int numHuesped;
    private int numHabitacion;
    private int numCama;
    private int numBaño;

    public InmuebleDatos() {
    }

    public InmuebleDatos(int numHuesped, int numHabitacion, int numCama, int numBaño) {
        this.numHuesped = numHuesped;
        this.numHabitacion = numHabitacion;
        this.numCama = numCama;
        this.numBaño = numBaño;
    }

    public int getNumHuesped() {
        return numHuesped;
    }

    public void setNumHuesped(int numHuesped) {
        this.numHuesped = numHuesped;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }

    public int getNumBaño() {
        return numBaño;
    }

    public void setNumBaño(int numBaño) {
        this.numBaño = numBaño;
    }
    
    

}
