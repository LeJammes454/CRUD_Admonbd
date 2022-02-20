/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pracmysql.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author xboxj
 */

public class Conexion {
    
    //ufas papa 
    Connection  con;
    
   
    
    
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conexion para base de datos en ubuntu
            con = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/admonbd","jaime","0454");
            
            //conexion de base de datos local para pruebas mas rapidas xd
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admonbd","root","045400");
            
        } catch (Exception e) {
        }
        
    }
        public Connection getConnection(){
            return con;
        }
    
}

