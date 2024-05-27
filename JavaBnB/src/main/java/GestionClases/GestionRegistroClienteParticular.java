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

    //método para añadir clientes
    public static ArrayList<ClienteParticular> altaClienteParticular(ClienteParticular clienteparticular) {
        try {

            if (listaClienteParticular.contains(clienteparticular)) {
                System.out.println("Error: cliente existente");
            }
            listaClienteParticular.add(clienteparticular);
            return listaClienteParticular;
        } 
        catch (Exception e) {
            System.out.print(e);
        }
        return listaClienteParticular;
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
}

    
    
    
    
    
    


