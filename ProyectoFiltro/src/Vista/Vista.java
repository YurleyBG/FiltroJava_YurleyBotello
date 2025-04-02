
package Vista;


import Modelo.ModeloMision;
import Modelo.ModeloMisionNinja;
import java.util.*;


public class Vista {
    public ModeloMision ListarMisionId(){
        System.out.println("---------ListarMision Por ID Ninja-------------\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        int id=scan.nextInt();
        return new ModeloMision(id);
    
    
    
    }
    public ModeloMisionNinja ListarMisionCompletadasId(){
        System.out.println("---------ListarMision Por ID Ninja-------------\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id del ninja: ");
        int ide=scan.nextInt();
        return new ModeloMisionNinja(ide);
    
    
    
    }
     public ModeloMisionNinja agendarMision(){
        System.out.println("---------Agendar misiones-------------\n");
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
        System.out.println("---------Actualizar Fecha fin-------------\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la id de la mision : ");
        scan.nextLine();
        int idem=scan.nextInt();
        System.out.println("Ingrese la fecha fin: ");
        String fechaIni=scan.nextLine();
        
        return new ModeloMisionNinja(idem,fechaIni);
    
    
    
    }
    
}
