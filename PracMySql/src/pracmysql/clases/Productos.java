/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pracmysql.clases;

/**
 *
 * @author xboxj
 */
public class Productos {

    private int id;
    private String NombreCorto;
    private String Descrpcion;
    private String Serie;
    private String Color;
    private String FechaAquisicon;
    private String TipoAdquision;
    private String Observaciones;
    private int IdArea;

    public Productos(int id, String NombreCorto, String Descrpcion, String Serie, String Color, String FechaAquisicon, String TipoAdquision, String Observaciones, int IdArea) {
        this.id = id;
        this.NombreCorto = NombreCorto;
        this.Descrpcion = Descrpcion;
        this.Serie = Serie;
        this.Color = Color;
        this.FechaAquisicon = FechaAquisicon;
        this.TipoAdquision = TipoAdquision;
        this.Observaciones = Observaciones;
        this.IdArea = IdArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCorto() {
        return NombreCorto;
    }

    public void setNombreCorto(String NombreCorto) {
        this.NombreCorto = NombreCorto;
    }

    public String getDescrpcion() {
        return Descrpcion;
    }

    public void setDescrpcion(String Descrpcion) {
        this.Descrpcion = Descrpcion;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getFechaAquisicon() {
        return FechaAquisicon;
    }

    public void setFechaAquisicon(String FechaAquisicon) {
        this.FechaAquisicon = FechaAquisicon;
    }

    public String getTipoAdquision() {
        return TipoAdquision;
    }

    public void setTipoAdquision(String TipoAdquision) {
        this.TipoAdquision = TipoAdquision;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getIdArea() {
        return IdArea;
    }

    public void setIdArea(int IdArea) {
        this.IdArea = IdArea;
    }

    @Override
    public String toString() {
        return "insert into inventario values (" + id + ",'" + NombreCorto + "','" + Descrpcion + "','" + Serie + "','" + Color + "','" + FechaAquisicon + "','" + TipoAdquision + "','" + Observaciones + "'," + IdArea + ")";
    }
    
    

}
