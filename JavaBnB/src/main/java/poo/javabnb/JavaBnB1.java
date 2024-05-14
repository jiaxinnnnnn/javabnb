package poo.javabnb;



import Clases.ClienteAnfitrion;
import Clases.ClienteParticular;
import GestionClases.GestionRegistroClienteParticular;
import Clases.Inmueble;
import interfaz.PantallaRegistros;
import interfaz.PantallaSesion;
import java.util.ArrayList;

public class JavaBnB1 {

    public static void main(String[] args) {

        PantallaSesion pant = new PantallaSesion();

        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        
        
        ArrayList<ClienteParticular> listaClientesParticular = new ArrayList<>();
        System.out.println(listaClientesParticular);
        ArrayList<ClienteAnfitrion> listaClientesAnfitrion = new ArrayList<>();
        System.out.println(listaClientesParticular);
        ArrayList<Inmueble> listaInmueble = new ArrayList<>();
        System.out.println(listaClientesParticular);
        

    }

}
