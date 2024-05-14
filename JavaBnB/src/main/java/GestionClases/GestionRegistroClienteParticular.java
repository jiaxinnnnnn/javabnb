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

public class GestionRegistroClienteParticular {

    private static final String FILENAME = "usuarios.dat";

    private final ArrayList<ClienteParticular> listaClientesParticular = new ArrayList<>();

    public void registrarClienteParticulares(boolean vip, String correo, String clave, String nombre, String dni, String telefono) throws FileNotFoundException, IOException, ClassNotFoundException {

        ClienteParticular clienteparticular = new ClienteParticular(vip, correo, clave, nombre, dni, telefono);

        HashMap<String, String> hashmap1 = new HashMap<>();
        hashmap1.put(clienteparticular.getCorreo(), clienteparticular.getClave());

        //fata excepciones
        FileOutputStream fosPer = new FileOutputStream("hashmapclienteparticular.dat");
        ObjectOutputStream oosPer = new ObjectOutputStream(fosPer);
        oosPer.writeObject(hashmap1);
        fosPer.close();
        oosPer.close();

        FileInputStream fisPer = new FileInputStream("hashmapclienteparticular.dat");
        ObjectInputStream oisPer = new ObjectInputStream(fisPer);
        try {
            while (true) {
                hashmap1 = (HashMap) oisPer.readObject();
                System.out.println(hashmap1.toString());
            }
        } catch (EOFException e) {
            System.out.println("Lectura de los objetos de tipo Persona finalizada");
        }

        fisPer.close();
        
        

    }

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
