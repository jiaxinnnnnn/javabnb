package GestionClases;

import Clases.ClienteAnfitrion;
import Clases.ClienteParticular;
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
    public static ArrayList<ClienteAnfitrion> altaClienteAnfitrion(ClienteAnfitrion clienteAnfitrion) {
        try {

            if (listaClienteAnfitrion.contains(clienteAnfitrion)) {
                System.out.println("Error: cliente existente");
            }
            else {
                listaClienteAnfitrion.add(clienteAnfitrion);
                return listaClienteAnfitrion;
            } 
        }
        catch (Exception e){
            System.out.print(e.toString());
        }
        return listaClienteAnfitrion;
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
   
}

