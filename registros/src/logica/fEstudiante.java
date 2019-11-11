/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import datos.vestudiantes;
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
public class fEstudiante {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Cod_Estudiantes","Tipo_Documento","Documento","Nombres","P_apellido","S_apellido","Telefono","Direccion","Año_Ingreso","Fecha_nacimiento"};
        String[] registro =new  String [10];
        
       totalregistros=0;
       modelo = new DefaultTableModel(null, titulos);
        
       
        sSQL="select * from estudiantes where Nombres like  '%"+ buscar + "%' order by Cod_Estudiantes desc";     
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cod_Estudiantes");
                registro[1] = rs.getString("Tipo_Documento");
                registro[2] = rs.getString("Num_Documento");
                registro[3] = rs.getString("Nombres");
                registro[4] = rs.getString("P_apellido");
                registro[5] = rs.getString("S_apellido");
                registro[6] = rs.getString("Telefono");
                registro[7] = rs.getString("Direccion");
                registro[8] = rs.getString("Año_Ingreso");
                registro[9] = rs.getString("Fecha_nacimiento");
                totalregistros += 1;
                modelo.addRow(registro);
                
            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
         }
        
      public DefaultTableModel mostrarvista(String buscar){
       
       DefaultTableModel modelo;
       
       String [] titulos = {"Cod_Estudiantes","Tipo_Documento","Documento","Nombres","P_apellido","S_apellido","Telefono","Direccion","Año_Ingreso","Fecha_nacimiento"};
       
       String [] registro =new String [10];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       sSQL="select * from estudiantes where Nombres like  '%"+ buscar + "%' order by Cod_Estudiantes desc";  
       
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
                 registro[0] = rs.getString("Cod_Estudiantes");
                registro[1] = rs.getString("Tipo_Documento");
                registro[2] = rs.getString("Num_Documento");
                registro[3] = rs.getString("Nombres");
                registro[4] = rs.getString("P_apellido");
                registro[5] = rs.getString("S_apellido");
                registro[6] = rs.getString("Telefono");
                registro[7] = rs.getString("Direccion");
                registro[8] = rs.getString("Año_Ingreso");
                registro[9] = rs.getString("Fecha_nacimiento");
                totalregistros += 1;
             
                              
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
            

    }

    public boolean insertar(vestudiantes dts) {
        sSQL = "insert into estudiantes (Tipo_Documento,Num_Documento,Nombres,P_apellido,S_apellido,Telefono,Direccion,Año_Ingreso,Fecha_nacimiento)"+
                "values (?,?,?,?,?,?,?,?,?)";
             
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setString(1, dts.getTipo_Documento());
            pst.setString(2, dts.getNum_Documento());
            pst.setString(3, dts.getNombres());
            pst.setString(4, dts.getP_apellido());
            pst.setString(5, dts.getS_apellido());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getDireccion());
            pst.setString(8, dts.getAño_Ingreso());
            pst.setDate(9, dts.getFecha_nacimiento());
            
             
             int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
                 
                  
           

          
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
   
   
   }
   
    public boolean editar(vestudiantes dts) {
                
       sSQL = "update estudiantes set Tipo_Documento=?,Num_Documento=?,Nombres=?,P_apellido=?,S_apellido=?,Telefono=?,Direccion=?,Año_Ingreso=?,Fecha_nacimiento=?"
                + "where Cod_Estudiantes=?";
    
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getTipo_Documento());
           pst.setString(2, dts.getNum_Documento());
           pst.setString(3, dts.getNombres());
           pst.setString(4, dts.getP_apellido());
           pst.setString(5, dts.getS_apellido());
           pst.setString(6, dts.getTelefono());
           pst.setString(7, dts.getDireccion());
           pst.setString(8, dts.getAño_Ingreso());
           pst.setDate(9, dts.getFecha_nacimiento());
           pst.setInt(10, dts.getCod_Estudiantes());
          
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
           
     

    public boolean eliminar(vestudiantes dts) {
        sSQL = "delete from estudiantes where Cod_Estudiantes=?";
        
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getCod_Estudiantes());
                        
                  
           int n = pst.executeUpdate();

            if (n != 0) {             
                         

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return false;
    }
       
    
      
    }
    
    
    
    
    
    
    

