
package Modelo;


public class ModeloMision {
    private int id;
    private String Descripcion;
    private String Rango;
    private int Recompensa;

    public ModeloMision(int id, String Descripcion, String Rango, int Recompensa) {
        this.id = id;
        this.Descripcion = Descripcion;
        this.Rango = Rango;
        this.Recompensa = Recompensa;
    }

    public ModeloMision() {
        
    }

    public ModeloMision(int id) {
         this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    public int getRecompensa() {
        return Recompensa;
    }

    public void setRecompensa(int Recompensa) {
        this.Recompensa = Recompensa;
    }
    
    
    
    
}
