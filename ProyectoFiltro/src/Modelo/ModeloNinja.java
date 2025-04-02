
package Modelo;


public class ModeloNinja {
    
    private int id;
    private String Nombre;
    private String Rango;
    private String Aldea;

    public ModeloNinja(int id, String Nombre, String Rango, String Aldea) {
        this.id = id;
        this.Nombre = Nombre;
        this.Rango = Rango;
        this.Aldea = Aldea;
    }

    public ModeloNinja() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public String getAldea() {
        return Aldea;
    }

    public void setAldea(String Aldea) {
        this.Aldea = Aldea;
    }
    
    
}
