
package Modelo;


public class ModeloMisionNinja {
    private int  id;
    private int idNinja;
    private int idMision;
    private String fechaInicio;
    private String fechafin;

    public ModeloMisionNinja(int id, int idNinja, int idMision, String fechaInicio, String fechafin) {
        this.id = id;
        this.idNinja = idNinja;
        this.idMision = idMision;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
    }

    public ModeloMisionNinja(int id1) {
         this.id = id1;
    }
    public ModeloMisionNinja(int id1, int idem, String fechaIni) {
        this.idNinja = idNinja;
        this.idMision = idMision;
        this.fechaInicio = fechaInicio;
    }
    public ModeloMisionNinja(int idem, String fechaIni) {
        this.idMision = idMision;
        this.fechaInicio = fechaInicio;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(int idNinja) {
        this.idNinja = idNinja;
    }

    public int getIdMision() {
        return idMision;
    }

    public void setIdMision(int idMision) {
        this.idMision = idMision;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
    
    
}
