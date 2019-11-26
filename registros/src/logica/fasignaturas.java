/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;


import Datos.vasignaturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class fasignaturas {
    
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Cod_Asignatura","Nombre","Int_Horaria","Grado"};
       
       String [] registro =new String [5];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from asignaturas where Nom_Asignatura like '%"+ buscar + "%' order by Grado desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("IdAsignatura");
               registro [1]=rs.getString("Cod_Asignatura");
               registro [2]=rs.getString("Nom_Asignatura");
               registro [3]=rs.getString("Int_Horaria");
               registro [4]=rs.getString("Grado");
               
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
             
       }
       public DefaultTableModel mostrarvista(String buscar){
       
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Cod_Asignatura","Nombre","Int_Horaria","Grado"};
       
       String [] registro =new String [5];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
        sSQL="select * from asignaturas where Nom_Asignatura like '%"+ buscar + "%' order by Grado desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("IdAsignatura");
               registro [1]=rs.getString("Cod_Asignatura");
               registro [2]=rs.getString("Nom_Asignatura");
               registro [3]=rs.getString("Int_Horaria");
               registro [4]=rs.getString("Grado");
             
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
            
     } 
         
   public boolean insertar (vasignaturas dts){
       sSQL="insert into asignaturas (Cod_Asignatura,Nom_Asignatura,Int_Horaria,Grado)" +
               "values (?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getCod_Asignatura());
           pst.setString(2, dts.getNom_Asignatura());
           pst.setInt(3, dts.getInt_Horaria());
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
   
   public boolean editar (vasignaturas dts){
       sSQL="update asignaturas set Cod_Asignatura=?,Nom_Asignatura=?,Int_Horaria=?,Grado=?"+
               " where IdAsignatura=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setString(1, dts.getCod_Asignatura());
           pst.setString(2, dts.getNom_Asignatura());
           pst.setInt(3, dts.getInt_Horaria());
           pst.setString(4, dts.getGrado());
           
           pst.setInt(5, dts.getIdAsignatura());
                     
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
  
   public boolean eliminar (vasignaturas dts){
       sSQL="delete  from asignaturas where IdAsignatura=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
             pst.setInt(1, dts.getIdAsignatura());
           
                    
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
  
        
          
    
   
    

