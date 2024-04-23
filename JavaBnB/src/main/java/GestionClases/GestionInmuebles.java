package GestionClases;

import java.awt.Image;
import Clases.ClienteAnfitrion;
import Clases.Inmueble;
import Clases.InmuebleDatos;
import Clases.InmuebleDireccion;
import Clases.InmuebleServicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GestionInmuebles {

    private static final String FILENAME = "usuarios.dat";

    private final List<Inmueble> listaInmueble = new ArrayList<>();

    public void registrarInmueble(String titulo, double precio, boolean casa, boolean apartamento, String direccion ,String codigoPostal, String ciudad, int numHuesped,int numHab, int numCama, int numBaño) {
        
        InmuebleDireccion direccionTotal = new InmuebleDireccion();
        
        InmuebleDatos datos = new InmuebleDatos();
        
        Inmueble inmueble = new Inmueble(titulo, precio, casa, apartamento, direccionTotal, datos);

        listaInmueble.add(inmueble);
        System.out.println(listaInmueble);
        

    }
}
