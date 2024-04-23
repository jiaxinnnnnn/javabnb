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
        for (ClienteParticular clienteparticular : listaClientesParticular) {
            //String correoUsuario = cliente.getCorreo();
            //String claveUsuario = cliente.getClave();
            if (clienteparticular.getCorreo().equals(correo) && clienteparticular.getClave().equals(clave)) {
                return true; //pasa siguiente pantalla
            }
        }
        return false; //mensaje error
    }

}
