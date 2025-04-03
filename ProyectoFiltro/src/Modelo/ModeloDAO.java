
package Modelo;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ModeloDAO {
    
    private String url="jdbc:mysql://bihcmnezuitmr4chyshx-mysql.services.clever-cloud.com:3306/bihcmnezuitmr4chyshx";
    private String user="uqyno8pwmfcue5r5";
    private String password="E7Tq5WcIa7WIvgxAy9sx";
    
    private Connection conect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    
    }
    
    // 1. Obtener nijas y habilidades 
    
    
    public List<String> obtenerNinjas(){
        String sql="select h.Nombre as habi, h.Descripcion as descri,n.* from Ninja n inner join Habilidad h on  n.id=h.Id_Ninja ";
        List<String> listaNinjas =new ArrayList<>();
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            ResultSet resultado= solicitud.executeQuery();
            while (resultado.next()){
                
                listaNinjas.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Nombre: "+
                        resultado.getString("Nombre")+"\n"+"Rango: "+
                        resultado.getString("Rango")+"\n"+"Aldea: "+
                        resultado.getString("Aldea")+"\n"+"Habilidad: "+
                        resultado.getString("habi")+"\n"+"Descripcion: "+
                        resultado.getString("descri")+"\n");
                
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
        return listaNinjas;
    
    
    }
    
    //2. Mostrar las misiones disponibles para un ninja específico.
    
    public List<String> MisionesNinjas(ModeloMision mision){
        String sql="select * from  Mision m inner join MisionNinja mn on m.Id=mn.Id_Mision where Id_Ninja=?  and mn.FechaFin is null   ";
        List<String> listaMision =new ArrayList<>();
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,mision.getId());
            ResultSet resultado= solicitud.executeQuery();
            while (resultado.next()){
                
                listaMision.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Descripcion: "+
                        resultado.getString("Descripcion")+"\n"+"Rango: "+
                        resultado.getString("Rango")+"\n"+"Recompensa: "+
                        resultado.getInt("Recompensa")+"\n");
                
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
        return listaMision;
    
    
    }
    //3. Mostrar las misiones completadas para un ninja específico.
    public List<String> MisionesNinjasCompletadas(ModeloMisionNinja misionN){
        String sql="select mn.FechaInicio as fechaI,mn.FechaFin as Fechaf, m.* from  Mision m inner join MisionNinja mn on m.Id=mn.Id_Mision where mn.Id_Ninja=? and mn.FechaFin is not null ";
        List<String> listaMisionNinja =new ArrayList<>();
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,misionN.getId());
            ResultSet resultado= solicitud.executeQuery();
            while (resultado.next()){
                
                listaMisionNinja.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Descripcion: "+
                        resultado.getString("Descripcion")+"\n"+"Rango: "+
                        resultado.getString("Rango")+"\n"+"Recompensa: "+
                        resultado.getInt("Recompensa")+"\n"+"FechaInicio: "+
                        resultado.getString("fechaI")+"\n"+"FechaFin: "+
                        resultado.getString("Fechaf")+"\n");
                
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
        return listaMisionNinja;
    
    
    }
    //4. Asignar una misión a un ninja, registrando la fecha de inicio.
    public List<String> asignarMision(ModeloMisionNinja misionN1){
        String sql="insert into MisionNinja(Id_Ninja,Id_Mision,FechaInicio,FechaFin) values (?,?,?,?) ";
        List<String> listaMisionNinja33 =new ArrayList<>();
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            String FechaFin=null;
            solicitud.setInt(1,misionN1.getIdNinja());
            solicitud.setInt(2,misionN1.getIdMision());
            solicitud.setString(3,misionN1.getFechaInicio());
            solicitud.setString(4,FechaFin);
            int filas= solicitud.executeUpdate();
            
            if(filas>0){
                 System.out.println("Se agrego la nueva mision al ninja de manera correcta");
            }else{
            
                System.out.println("No se puede agrego la nueva mision al ninja " );
            
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
        return listaMisionNinja33;
    
    
    
    
    }
    //5. Marcar una misión como completada, registrando la fecha de finalización.
    public void misionComple(ModeloMisionNinja misionN1){
        String sql="update MisionNinja set FechaFin=? where Id=? ";
      
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setString(1,misionN1.getFechafin());
            solicitud.setInt(2,misionN1.getId());
            int filas= solicitud.executeUpdate();
            if(filas>0){
                 System.out.println("Registro de la mision completado con exito");
            }else{
            
                System.out.println("Fallo el registro de la misiom" );
            
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
    
    }
    // 6. Mostrar todas las misiones completadas
     public List<String> MisionesCompletadas(){
        String sql="select mn.FechaInicio as fechaI,mn.FechaFin as Fechaf, m.* from  Mision m inner join MisionNinja mn on m.Id=mn.Id_Mision where mn.FechaFin is not null ";
        List<String> listaMisionNinja =new ArrayList<>();
        try(
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            ResultSet resultado= solicitud.executeQuery();
            while (resultado.next()){
                
                listaMisionNinja.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Descripcion: "+
                        resultado.getString("Descripcion")+"\n"+"Rango: "+
                        resultado.getString("Rango")+"\n"+"Recompensa: "+
                        resultado.getInt("Recompensa")+"\n"+"FechaInicio: "+
                        resultado.getString("fechaI")+"\n"+"FechaFin: "+
                        resultado.getString("Fechaf")+"\n");
                
            }
        
        }catch(SQLException e){
            System.out.println("Error al imprimir en el servidor.");
            System.out.println(e);
        
        
        }
        return listaMisionNinja;
    
    
    }
    
    
}
