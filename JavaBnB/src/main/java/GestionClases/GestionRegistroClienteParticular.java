package GestionClases;

import Clases.ClienteParticular;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GestionRegistroClienteParticular {

    private static ArrayList<ClienteParticular> listaClienteParticular = new ArrayList<>();

    public GestionRegistroClienteParticular() {
    }

    public static ArrayList<ClienteParticular> getListaClienteParticular() {
        return listaClienteParticular;
    }

    public static void setClienteParticular(ArrayList<ClienteParticular> clienteparticular) {
        GestionRegistroClienteParticular.listaClienteParticular = clienteparticular;
    }

    //método para eliminar clientes
    public static boolean bajaClienteParticular(ClienteParticular clienteparticular) {
            if (listaClienteParticular.contains(clienteparticular)) {
                listaClienteParticular.remove(clienteparticular);
                return true;
            }
            else{
                return false;
            }
        } 
    //método para añadir clientes
    public static boolean altaClienteParticular(ClienteParticular clienteparticular) {
            if (!listaClienteParticular.contains(clienteparticular)) {
                listaClienteParticular.add(clienteparticular);
                return true;
            }
            else{
                return false;
            }
        } 

    //método búsqueda de ofertas que devuelve una lista con las oferta encontradas
    public static List<ClienteParticular> busquedaClienteParticular(String correo, String clave) {

        List<ClienteParticular> listabuscarclientepart = listaClienteParticular.stream()
                .filter(oe -> (oe.getCorreo().equals(correo) && oe.getClave().equals(clave)))
                .sorted().collect(Collectors.toList());
        /* Sin streams:
        ArrayList<ClienteParticular> buscarclienteparticular = new ArrayList<>();
        for (ClienteParticular oe : listaClienteParticular) {
                if (oe.getCorreo().equals(correo) && oe.getClave().equals(clave)) {
                    listabuscarclientepart.add(oe);
                }
        }
        return ofertasBuscadas;
         */

        return listabuscarclientepart;
    }
    
        /** Guarda los datos de Clientes Particulares en el fichero */
    public static void guardarClientesP() {
        try {
            //Si hay datos los guardamos...
            if (!listaClienteParticular.isEmpty()) {
                try (FileOutputStream fos = new FileOutputStream("clienteParticular.dat")) {
                    ObjectOutputStream oos= new ObjectOutputStream(fos);
                    //guardamos el array de Clientes Particulares
                    oos.writeObject(listaClienteParticular);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
    }
    
     /** Carga los datos de Clientes Particulares del fichero */
    public static void cargarClientesP() {
        try {
            try (FileInputStream fis = new FileInputStream("clienteParticular.dat")) {
                ObjectInputStream ois= new ObjectInputStream(fis);
                listaClienteParticular = (ArrayList) ois.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
    }//fin cargarDatos
}

    
    
    
    
    
    


