
package Controlador;
import java.sql.*;
import java.util.*;
import Modelo.ModeloDAO;
import Modelo.ModeloHabilidad;
import Modelo.ModeloMision;
import Modelo.ModeloMisionNinja;
import Modelo.ModeloNinja;
import Vista.Vista;
import java.util.Scanner;


public class controlador {
    private ModeloNinja Mninja ;
    private ModeloMision Mmision ;
    private ModeloMisionNinja MninjaMision ;
    private ModeloHabilidad MHabilidad;
    private ModeloDAO Consultas;
    private Vista vistas;
    private Scanner scan;

    public controlador( ModeloDAO Consultas, Vista vistas) {
        this.Mninja = Mninja;
        this.Mmision = Mmision;
        this.MninjaMision = MninjaMision;
        this.MHabilidad = MHabilidad;
        this.Consultas = Consultas;
        this.vistas = vistas;
        this.scan = scan=new Scanner(System.in);
    }

   
    
    public void iniciar() throws SQLException{
        
        boolean bool=true;
        while (bool){
            
            System.out.println("----------------Menu Principal------------------------");
            System.out.println("1. Listar los ninjas."); 
            System.out.println("2. Listar las misiones disponibles por ninja especifico. "); 
            System.out.println("3. Listar las misiones completadas por ninja especifico."); 
            System.out.println("4. Asignar mision."); 
            System.out.println("5. Actualizar estado de la mision."); 
            System.out.println("6. Mostrar misiones completadas."); 
            System.out.println("7. Salir.");
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Ingresa la opcion a la que deseas entrar: ");
            int opcion=scan.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("---------Listar Ninjas-------------\n");
                    List<String> listaNinja= new ArrayList<>();
                    listaNinja=Consultas.obtenerNinjas();
                    for(String ninjas: listaNinja){
                        System.out.println(ninjas + "\n-----------------------------------");

                    }
                    
                break;
                case 2:
                    List<String> listaMision= new ArrayList<>();
                    ModeloMision mision= vistas.ListarMisionId();
                    listaMision=Consultas.MisionesNinjas(mision);
                    for(String misio: listaMision){
                        System.out.println(misio + "\n-----------------------------------");

                    }
                    
                    
                break;
                case 3:
                    List<String> listaMisionNinja1= new ArrayList<>();
                    ModeloMisionNinja misioncomple=vistas.ListarMisionCompletadasId();
                    listaMisionNinja1=Consultas.MisionesNinjasCompletadas(misioncomple);
                    for(String misioN: listaMisionNinja1){
                        System.out.println(misioN + "\n-----------------------------------");

                    }
                break;
                case 4:
                    
                    
                    System.out.println("");
                    List<String> listaMisionNinja12= new ArrayList<>();
                    ModeloMisionNinja asigmisio=vistas.agendarMision();
                    listaMisionNinja12=Consultas.asignarMision(asigmisio);
                    for(String misioN: listaMisionNinja12){
                        System.out.println(misioN + "\n-----------------------------------");

                    }
                break;
                case 5:
                    ModeloMisionNinja misiocom=vistas.comMision();
                    Consultas.misionComple(misiocom);
                    
                break;
                case 6:
                     System.out.println("");
                break;
                case 7:
                     System.out.println("");
                break;
                case 8: 
                    System.out.println("Haz abandona el programa :(");
                    bool=false;
                break;
            
            
            }
             
        
        
        
        }   
        
        
        
     
     
     
     
    }
    
    
    
    
    
}
