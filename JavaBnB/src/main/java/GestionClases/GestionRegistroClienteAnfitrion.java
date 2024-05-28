package GestionClases;

import Clases.ClienteAnfitrion;
import Clases.ClienteParticular;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class GestionRegistroClienteAnfitrion implements Serializable{

     private static ArrayList<ClienteAnfitrion> listaClienteAnfitrion = new ArrayList<>();

    public GestionRegistroClienteAnfitrion() {
    }

    public static ArrayList<ClienteAnfitrion> getListaClienteParticular() {
        return listaClienteAnfitrion;
    }

    public static void setClienteParticular(ArrayList<ClienteAnfitrion> clienteAnfitrion) {
        GestionRegistroClienteAnfitrion.listaClienteAnfitrion = clienteAnfitrion;
    }

    //método para añadir clientes
    public static boolean altaClienteAnfitrion(ClienteAnfitrion clienteAnfitrion) {
            if (!listaClienteAnfitrion.contains(clienteAnfitrion)) {
                listaClienteAnfitrion.add(clienteAnfitrion);
                return true;
            }
            else {
                return false;
            } 
        }

    //método para eliminar clientes
    public static boolean bajaClienteAnfitrion(ClienteAnfitrion clienteAnfitrion) {
            if (listaClienteAnfitrion.contains(clienteAnfitrion)) {
                listaClienteAnfitrion.remove(clienteAnfitrion);
                return true;
            }
            else {
                return false;
            } 
    }
    

    //método búsqueda de ofertas que devuelve una lista con las oferta encontradas
    public static List<ClienteAnfitrion> busquedaClienteAnfitrion(String correo, String clave) {

        List<ClienteAnfitrion> listaBuscarClienteAnf = listaClienteAnfitrion.stream()
                .filter(ca -> (ca.getCorreo().equals(correo) && ca.getClave().equals(clave)))
                .sorted().collect(Collectors.toList());
        /* Sin streams:
        ArrayList<ClienteAnfitrion> buscarclienteAnfitrion = new ArrayList<>();
        for (ClienteAnfitrion ca : listaClienteAnfitrion) {
                if (ca.getCorreo().equals(correo) && ca.getClave().equals(clave)) {
                    listaBuscarClienteAnf.add(ca);
                }
        }
        return ofertasBuscadas;
         */

        return listaBuscarClienteAnf;
    }
    
         /** Guarda los datos de Clientes Anfitriones en el fichero */
    public static void guardarClientesA() {
        try {
            //Si hay datos los guardamos...
            if (!listaClienteAnfitrion.isEmpty()) {
                try (FileOutputStream fos = new FileOutputStream("clienteAnfitrion.dat")) {
                    ObjectOutputStream oos= new ObjectOutputStream(fos);
                    //guardamos el array de Clientes Particulares
                    oos.writeObject(listaClienteAnfitrion);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
    }
    
     /** Carga los datos de Clientes Anfitriones del fichero */
    public static void cargarClientesA() {
        try {
            try (FileInputStream fis = new FileInputStream("clienteAnfitrion.dat")) {
                ObjectInputStream ois= new ObjectInputStream(fis);
                listaClienteAnfitrion = (ArrayList) ois.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } 
    }//fin cargarDatos
   
}

