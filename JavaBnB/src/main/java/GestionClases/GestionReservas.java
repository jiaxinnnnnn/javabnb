/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionClases;


import Clases.ClienteParticular;
import Clases.InmuebleDatos;
import Clases.Reserva;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author sgsic
 */


public class GestionReservas {
    
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static Reserva reserva;
    private static LocalDate fechaEntrada;
    private static LocalDate fechaSalida;
     
      /** Guarda los datos de Reservas en el fichero */
    public static void guardarReservas() {
        try {
            //Si hay datos los guardamos...
            if (!reservas.isEmpty()) {
                try (FileOutputStream fos = new FileOutputStream("reservas.dat")) {
                    ObjectOutputStream oos= new ObjectOutputStream(fos);
                    //guardamos el array de Reservas
                    oos.writeObject(reservas);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
    }
    
     /** Carga los datos de Reservas del fichero */
    public static void cargarReservas() {
        try {
            try (FileInputStream fis = new FileInputStream("reservas.dat")) {
                ObjectInputStream ois= new ObjectInputStream(fis);
                reservas = (ArrayList) ois.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
    }//fin cargarDatos
    
    public static void generaFactura(Reserva res, InmuebleDatos inmuebleDatos, ClienteParticular clienteParticular, LocalDate fechaEntrada, LocalDate fechaSalida) throws IOException {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        String fn = hoy.format(formatoCorto);        
        String rutaFicheroFactura = "./Facturas/Factura(" + fn.replace('/', '_') + ").txt";
        double importe = clienteParticular.getTarjetaCrédito().getImporte();
        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("-------------------------------- Factura Producto --------------------------------");
                salida.println("\n");
                salida.println("-------------------------Fecha de la reserva: " + fn + " -------------------------");
                salida.println("\n");
                salida.println("Importe: " + importe);
                salida.println("\n");
                salida.println("------------------------------------ Inmueble ------------------------------------");
                salida.println("\n");
                salida.println("Número de huespedes: " + inmuebleDatos.getNumHuesped());
                salida.println("\n");
                salida.println("Número de habitaciones: " + inmuebleDatos.getNumHabitacion());
                salida.println("\n");
                salida.println("Número de camas: " + inmuebleDatos.getNumCama() );
                salida.println("\n");
                salida.println("Número de baños: " + inmuebleDatos.getNumBaño());
                salida.println("\n");
                salida.println("------------------------------------ Cliente -------------------------------------");
                salida.println("\n");
                salida.println("Correo: " + clienteParticular.getCorreo());
                salida.println("\n");
                salida.println("clave: " + clienteParticular.getClave());
                salida.println("\n");
                salida.println("Nombre: " + clienteParticular.getNombre());
                salida.println("\n");
                salida.println("DNI: " + clienteParticular.getDni());
                salida.println("\n");
                salida.println("Teléfono: " + clienteParticular.getTelefono());
                salida.println("\n");
                salida.println("----------------------------------------------------------------------------------");
                salida.println("\n");
                salida.println("Fecha de entrada: " + fechaEntrada);
                salida.println("\n");
                salida.println("----------------------------------------------------------------------------------");
                salida.println("\n");
                salida.println("Fecha de salida " + fechaSalida);
                salida.println("\n");
                
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }//fin generaFactura
    
}
