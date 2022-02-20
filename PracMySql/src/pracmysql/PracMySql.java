/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pracmysql;

import pracmysql.clases.Areas;
import pracmysql.clases.Productos;

/**
 *
 * @author xboxj
 */
public class PracMySql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Areas are = new Areas(0,"Capilla", "SurOeste");
        System.out.println(are);
        
        Productos produ = new Productos(1, "Zacruse", "Tacos", "Z454", "Azul", "14-2-2022","Activo" , "NINGUNA", 1);
        System.out.println(produ);
    }
    
}
