/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Datos.vmatriculado;
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
public class fmatricula {
    
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros; 
   private String travis;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Cod_Estudiantes","Año_Matricula","Grado","Grupo"};
       
       String [] registro =new String [5];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from matriculas where idMatricula like '%"+ buscar + "%' order by Cod_Estudiantes desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idMatricula");
               registro [1]=rs.getString("Cod_Estudiantes");
               registro [2]=rs.getString("Año_Matricula");
               registro [3]=rs.getString("Grado");
               registro [4]=rs.getString("Grupo");
           
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
            
   } 
   
   public boolean insertar (vmatriculado dts){
       sSQL="insert into matriculas (idMatricula,Cod_Estudiantes,Año_Matricula,Grado,Grupo)" +
               "values (?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdMatricula());
           pst.setInt(2, dts.getCod_Estudiantes());
           pst.setString(3, dts.getAño_Matricula());
           pst.setString(4, dts.getGrado());
           pst.setString(5, dts.getGrupo());
           
           
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
   public boolean editar (vmatriculado dts) throws SQLException{
       sSQL="update matriculas set Cod_Estudiantes=?,Año_Matricula=?,Grado=?,Grupo=?"+
               " where idMatricula=?";
                 
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getCod_Estudiantes()); 
           pst.setString(2, dts.getAño_Matricula());
           pst.setString(3, dts.getGrado());
           pst.setString(4, dts.getGrupo());
           
           pst.setInt(5, dts.getIdMatricula());
                     
           
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
  
   public boolean eliminar (vmatriculado dts){
       sSQL="delete from matriculas where idMatricula=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdMatricula());
         
           
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
