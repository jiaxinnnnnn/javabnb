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
import Clases.ClienteAnfitrion;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GestionInmuebles {
    
  
    private static ArrayList<Inmueble> listainmuebles = new ArrayList<>();
    LocalDate fechaInicio;
    LocalDate fechaFin;
   

    public GestionInmuebles() {
    }

    public static ArrayList<Inmueble> getInmuebles() {
        return listainmuebles;
    }

    public static void setInmuebles(ArrayList<Inmueble> inmuebles) {
        GestionInmuebles.listainmuebles = inmuebles;
    }

    //método para añadir ofertas
    public static String altaInmuebles(Inmueble inmueble) {
        try {

            if (listainmuebles.contains(inmueble)) {
                System.out.println("Error: inmueble existente");
            }
            listainmuebles.add(inmueble);
            return "Oferta dada de alta correctamente";
        } finally {
            System.out.println("Error en la entrada");
        }
    }

    //método búsqueda de ofertas que devuelve una lista con las oferta encontradas
    public static List<Inmueble> buscarInmuebles(String ciudad) {

        List<Inmueble> listabuscarinmuebles = listainmuebles.stream()
                .filter(oe -> (oe.getDireccion().getCiudad().equals(ciudad)))
                .sorted().collect(Collectors.toList());

        return listabuscarinmuebles;
    }

    public static ArrayList<Inmueble> getInmueblePorPrecio() {
        //Comparador para ordenar los Productos por su nombre
        Comparator comparadorPrecio = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                Double pr1 = p1.getPrecio();
                Double pr2 = p2.getPrecio();
                return pr1.compareTo(pr2);
            }
        };
        //Ordenamos el array
        Collections.sort(listainmuebles, comparadorPrecio);
        return listainmuebles;
    }

    public static ArrayList<Inmueble> getInmueblePorCalificacion() {
        //Comparador para ordenar los Productos por Calificacion
        Comparator comparadorCalificacion = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                Double pr1 = p1.getCalificacion();
                Double pr2 = p2.getCalificacion();
                return pr2.compareTo(pr1);
            }
        };
        //Ordenamos el array
        Collections.sort(listainmuebles, comparadorCalificacion);
        return listainmuebles;
    }

    public static ArrayList<Inmueble> getInmueblePorTipoCasa() {
        Comparator comparadorTipo = new Comparator() {

            @Override
            public int compare(Object i1, Object i2) {
                Inmueble p1 = (Inmueble) i1;
                Inmueble p2 = (Inmueble) i2;
                return Boolean.compare(p2.isCasa(), p1.isCasa());
            }
        };

        // Ordenar la lista utilizando el Comparator
        Collections.sort(listainmuebles, comparadorTipo);
        return listainmuebles;

        

    }
    public static ArrayList<Inmueble> getInmueblePorTipoApart() {
        Comparator comparadorTipo = new Comparator() {

            @Override
            public int compare(Object i1, Object i2) {
                Inmueble p1 = (Inmueble) i1;
                Inmueble p2 = (Inmueble) i2;
                return Boolean.compare(p2.isApartamento(), p1.isApartamento());
            }
        };

        // Ordenar la lista utilizando el Comparator
        Collections.sort(listainmuebles, comparadorTipo);
        return listainmuebles;
    }
        
        
    public static long calcularDiasEstancia(LocalDate fechaInicio, LocalDate fechaFin) {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }
}


