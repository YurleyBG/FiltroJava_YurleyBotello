
package Modelo;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ModeloDAO {
    
    private String url="jdbc:mysql://bi04hajxsoddeqsorrac-mysql.services.clever-cloud.com:3306/bi04hajxsoddeqsorrac";
    private String user="ulkfmf19e8cghi6u";
    private String password="O9H0oKrorllRuYO8zPIz";
    
    private Connection conect() throws SQLException {
    
        System.out.println("Conectado a la base de datos");
        return DriverManager.getConnection(url, user, password);
    
    }
    
    // Obtener nijas y habilidades 
    
    
    public List<String> obtenerNinjas(){
        String sql="select h.Nombre as habi, h.Descripcion as descri,n.* from Ninja n inner join Habilidad h on  n.id=h.Id_Ninja ";
        List<String> listaNinjas =new ArrayList<>();
        try{
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql);
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
            System.out.println("Error al mostrar");
            System.out.println(e);
        
        
        }
        return listaNinjas;
    
    
    }
    
    //Mostrar las misiones disponibles para un ninja específico.
    
    public List<String> MisionesNinjas(ModeloMision mision){
        String sql="select * from  Mision m inner join MisionNinja mn on m.Id=mn.Id_Mision where Id_Ninja=?  and mn.FechaFin is null   ";
        List<String> listaMision =new ArrayList<>();
        try{
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql);
            solicitud.setInt(1,mision.getId());
            ResultSet resultado= solicitud.executeQuery();
            while (resultado.next()){
                
                listaMision.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Descripcion: "+
                        resultado.getString("Descripcion")+"\n"+"Rango: "+
                        resultado.getString("Rango")+"\n"+"Recompensa: "+
                        resultado.getInt("Recompensa")+"\n");
                
            }
        
        }catch(SQLException e){
            System.out.println("Error al mostrar");
            System.out.println(e);
        
        
        }
        return listaMision;
    
    
    }
    //Mostrar las misiones completadas para un ninja específico.
    public List<String> MisionesNinjasCompletadas(ModeloMisionNinja misionN){
        String sql="select mn.FechaInicio as fechaI,mn.FechaFin as Fechaf, m.* from  Mision m inner join MisionNinja mn on m.Id=mn.Id_Mision where mn.Id_Ninja=? and mn.FechaFin is not null ";
        List<String> listaMisionNinja =new ArrayList<>();
        try{
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql);
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
            System.out.println("Error al mostrar");
            System.out.println(e);
        
        
        }
        return listaMisionNinja;
    
    
    }
    //Asignar una misión a un ninja, registrando la fecha de inicio.
    public List<String> asignarMision(ModeloMisionNinja misionN1){
        String sql="insert into MisionNinja(Id_Ninja,Id_Mision,FechaInicio,FechaFin) values (?,?,?,?) ";
        String sql2="select * from MisionNinja";
        List<String> listaMisionNinja33 =new ArrayList<>();
        try{
            String FechaFin=null;
            Connection conexionInterna= conect();
            PreparedStatement solicitud1= conexionInterna.prepareStatement(sql2);
            ResultSet resultado=solicitud1.executeQuery();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql);
            solicitud.setInt(1,misionN1.getIdNinja());
            solicitud.setInt(2,misionN1.getIdMision());
            solicitud.setString(3,misionN1.getFechaInicio());
            solicitud.setString(4,FechaFin);
            int filas= solicitud.executeUpdate();
            while (resultado.next()){
                
                listaMisionNinja33.add("\n"+"ID: "+resultado.getInt("id")+"\n"+"Id_Ninja: "+
                        resultado.getString("Id_Ninja")+"\n"+"Id_mision: "+
                        resultado.getString("Id_Mision")+"\n"+"FechaInicio: "+
                        resultado.getString("fechaI")+"\n"+"FechaFin: "+
                        resultado.getString("Fechaf")+"\n");
                
            }
            if(filas>0){
                 System.out.println("usuario actualizado correctamente");
            }else{
            
                System.out.println("no se puede actualizar el usuario con la id " );
            
            }
        
        }catch(SQLException e){
            System.out.println("Error al mostrar");
            System.out.println(e);
        
        
        }
        return listaMisionNinja33;
    
    
    
    
    }
    //Marcar una misión como completada, registrando la fecha de finalización.
    public void misionComple(ModeloMisionNinja misionN1){
        String sql="update MisionNinja set FechaFin=? where Id_Mision=? ";
      
        try{
            Connection conexionInterna= conect();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql);
            solicitud.setString(1,misionN1.getFechafin());
            solicitud.setInt(2,misionN1.getIdMision());
            int filas= solicitud.executeUpdate();
            if(filas>0){
                 System.out.println("usuario actualizado correctamente");
            }else{
            
                System.out.println("no se puede actualizar el usuario con la id " );
            
            }
        
        }catch(SQLException e){
            System.out.println("Error al mostrar");
            System.out.println(e);
        
        
        }
    
    }
    
}
