/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Datos.vlogros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class flogros {
    
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"Id","Cod_Asignatura","Descripción","Grado"};
       
       String [] registro =new String [4];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from tab_logros where Descripcion like '%"+ buscar + "%' order by Cod_Asignatura desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("IdLogros");
               registro [1]=rs.getString("Cod_Asignatura");
               registro [2]=rs.getString("Descripcion");
               registro [3]=rs.getString("Grado");
           
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (vlogros dts){
       sSQL="insert into tab_logros (Idlogros,Cod_Asignatura,Descripcion,Grado)" +
               "values (?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdLogros());
           pst.setString(2, dts.getCod_Asignatura());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getGrado());
           
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (vlogros dts) throws SQLException{
       sSQL="update tab_logros set Cod_Asignatura=?,Descripcion=?,Grado=?"+
               " where IdLogros=?";
                 
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setString(1, dts.getCod_Asignatura());
           pst.setString(2, dts.getDescripcion());
           pst.setString(3, dts.getGrado());
           
           pst.setInt(4, dts.getIdLogros());
                     
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
                      
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   public boolean eliminar (vlogros dts){
       sSQL="delete from tab_logros where IdLogros=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdLogros());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
    
    
    
}
