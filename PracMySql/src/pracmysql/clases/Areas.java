/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pracmysql.clases;

/**
 *
 * @author xboxj
 */
public class Areas {
    private int id;
    private String Nombre;
    private String Ubicacion;

    public Areas(int id, String Nombre, String Ubicacion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
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

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    @Override
    public String toString() {
        return "insert into areas values (" + id + ",'" + Nombre + "','" + Ubicacion + "')";
             
   }
    
    
    
    
}
