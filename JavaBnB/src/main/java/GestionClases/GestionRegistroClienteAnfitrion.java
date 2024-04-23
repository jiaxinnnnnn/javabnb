package GestionClases;

import Clases.ClienteAnfitrion;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GestionRegistroClienteAnfitrion {

    private static final String FILENAME = "usuarios.dat";

    private final List<ClienteAnfitrion> listaClientesAnfitrion = new ArrayList<>();

    public void registrarClienteAnfitrion(Date fecha, boolean superanfitrion, String correo, String clave, String nombre, String dni, String telefono) {
        ClienteAnfitrion clienteanfitrion = new ClienteAnfitrion ( fecha, superanfitrion, correo, clave, nombre, dni,telefono);

        listaClientesAnfitrion.add(clienteanfitrion);
    }

    public boolean validarClienteAnfitrion(String correo, String clave) {
        for (ClienteAnfitrion clienteanfitrion : listaClientesAnfitrion) {
            //String correoUsuario = cliente.getCorreo();
            //String claveUsuario = cliente.getClave();
            if (clienteanfitrion.getCorreo().equals(correo) && clienteanfitrion.getClave().equals(clave)) {
                return true; //pasa siguiente pantalla
            }
        }
        return false; //mensaje error
    }
    
    public void cambiarDatosClienteAnfitrion(){
        
}

}
