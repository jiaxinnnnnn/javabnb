package GestionClases;

import Clases.ClienteAnfitrion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GestionRegistroClienteAnfitrion implements Serializable{

    private static final String FILENAME = "usuarios.dat";

    private final List<ClienteAnfitrion> listaClientesAnfitrion = new ArrayList<>();

    public void registrarClienteAnfitrion(Date fechaRegistro, boolean superanfitrion, String correo, String clave, String nombre, String dni, String telefono) {
        ClienteAnfitrion clienteanfitrion = new ClienteAnfitrion ( fechaRegistro, superanfitrion, correo, clave, nombre, dni,telefono);

        listaClientesAnfitrion.add(clienteanfitrion);
        System.out.println(listaClientesAnfitrion);
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
    
    public void cambiarDatosClienteAnfitrion(ClienteAnfitrion clienteanfitrion, Date nuevaFechaRegistro, boolean nuevoSuperanfitrion, String nuevoCorreo, String nuevaClave, String nuevoNombre, String nuevoDni, String nuevoTelefono){
        if (listaClientesAnfitrion.contains(clienteanfitrion)){
            clienteanfitrion.setFecha(nuevaFechaRegistro);
            clienteanfitrion.setSuperanfitrion(nuevoSuperanfitrion);
            clienteanfitrion.setCorreo(nuevoCorreo);
            clienteanfitrion.setClave(nuevaClave);
            clienteanfitrion.setNombre(nuevoNombre);
            clienteanfitrion.setDni(nuevoDni);
            clienteanfitrion.setTelefono(nuevoTelefono);   
        }
        }
    
    
    
    
    
}

