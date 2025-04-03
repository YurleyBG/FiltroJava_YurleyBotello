
package Modelo;


public class ModeloHabilidad {
    private int id;
    private int idNinja;
    private String Nombre;
    private String Descripcion;

    public ModeloHabilidad(int id, int idNinja, String Nombre, String Descripcion) {
        this.id = id;
        this.idNinja = idNinja;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public ModeloHabilidad() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNija() {
        return idNinja;
    }

    public void setIdNija(int idNija) {
        this.idNinja = idNija;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
}
