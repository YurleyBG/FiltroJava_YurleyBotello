
package proyectofiltro;

import Controlador.controlador;
import Modelo.ModeloDAO;
import Modelo.ModeloHabilidad;
import Modelo.ModeloMision;
import Modelo.ModeloMisionNinja;
import Modelo.ModeloNinja;
import Vista.Vista;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;

public class Main {

   
    public static void main(String[] args) throws SQLException {
        ModeloDAO dao= new ModeloDAO();
        Vista vistas= new Vista();
        
        controlador con =new controlador(dao, vistas) ;
        con.iniciar();
    }
    
}
