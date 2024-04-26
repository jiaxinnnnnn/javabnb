package GestionClases;

import Clases.ClienteParticular;
import java.util.ArrayList;
import java.util.List;

public class GestionRegistroClienteParticular {

    private static final String FILENAME = "usuarios.dat";

    private final List<ClienteParticular> listaClientesParticular = new ArrayList<>();

    public void registrarClienteParticular(boolean vip, String correo, String clave, String nombre, String dni, String telefono) {
        ClienteParticular clienteparticular = new ClienteParticular(vip, correo, clave, nombre, dni, telefono);

        listaClientesParticular.add(clienteparticular);
        System.out.println(listaClientesParticular);
    }

    public boolean validarClienteParticular(String correo, String clave) {
        //comprobar si hay algo en la lista
        
        if (listaClientesParticular.isEmpty()) {
            System.out.println("La lista de clientes particulares está vacía.");
        } else {
            System.out.println("La lista de clientes particulares no está vacía.");
        }
        for (ClienteParticular clienteparticular : listaClientesParticular) {
            String correoUsuario = clienteparticular.getCorreo();
            String claveUsuario = clienteparticular.getClave();
            if (correoUsuario.equals(correo) && claveUsuario.equals(clave)) {
                return true; //pasa siguiente pantalla
            }
        }
        return false; //mensaje error
    }

}
