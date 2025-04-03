
package Vista;


import Modelo.ModeloMision;
import Modelo.ModeloMisionNinja;
import java.util.*;


public class Vista {
    public ModeloMision ListarMisionId(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id del ninja: ");
        int id=scan.nextInt();
        return new ModeloMision(id);
    
    
    
    }
    public ModeloMisionNinja ListarMisionCompletadasId(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id del ninja: ");
        int ide=scan.nextInt();
        return new ModeloMisionNinja(ide);
    
    
    
    }
     public ModeloMisionNinja agendarMision(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id del ninja: ");
        int ide2=scan.nextInt();
        System.out.println("Ingrese la id de la mision : ");
        int idem=scan.nextInt();
        System.out.println("Ingrese la fecha de inicio : ");
        scan.nextLine();
        String fechaIni=scan.nextLine();
        
        return new ModeloMisionNinja(ide2,idem,fechaIni);
    
    
    
    }
    public ModeloMisionNinja comMision(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        int idecita=scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese la fecha fin: ");
        String fechaFin=scan.nextLine();
        
       return new ModeloMisionNinja(idecita,fechaFin);
    
    
    
    }
    
}
