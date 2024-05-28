package poo.javabnb;

import Clases.ClienteAnfitrion;
import Clases.ClienteParticular;
import GestionClases.GestionRegistroClienteParticular;
import Clases.Inmueble;
import interfaz.PantallaRegistros;
import interfaz.PantallaSesion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class JavaBnB1 {//excepciones no tratados

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        PantallaSesion pant = new PantallaSesion();

        pant.setVisible(true);
        pant.setLocationRelativeTo(null);

        ClienteParticular cliente = new ClienteParticular();
        cliente.setVip(false);
        cliente.setCorreo("dfds");
        cliente.setClave("defvds");
        cliente.setDni("wde");
        cliente.setNombre("sdsa");
        cliente.setTelefono("ervfgdfvs");

        //guardar
        FileOutputStream fosPer = new FileOutputStream( "archivoClientesParticulares.txt");
        ObjectOutputStream oosPer = new ObjectOutputStream(fosPer);
        oosPer.writeObject(cliente);
        oosPer.close();

        //leer
        FileInputStream fisPer = new FileInputStream("archivoClientesParticulares.txt");
        ObjectInputStream oisPer = new ObjectInputStream(fisPer);
        ClienteParticular aaa = (ClienteParticular) oisPer.readObject();
        oisPer.close();
        System.out.println(aaa);

    }

}
