/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Date;


/**
 *

 */
public class vestudiantes {
     
    
    private int Cod_Estudiantes;
    private String Nombres;
    private String P_apellido;
    private String S_apellido;
    private String Tipo_Documento;
    private String Num_Documento;
    private String Telefono;
    private String Direccion;    
    private String Año_Ingreso;
    private Date Fecha_nacimiento;
   
   
    

    public vestudiantes() {
        
    }

    public vestudiantes(int Cod_Estudiantes, String Nombres, String P_apellido, String S_apellido, String Tipo_Documento, String Num_Documento, String Telefono, String Direccion, String Año_Ingreso, Date Fecha_nacimiento) {
        this.Cod_Estudiantes = Cod_Estudiantes;
        this.Nombres = Nombres;
        this.P_apellido = P_apellido;
        this.S_apellido = S_apellido;
        this.Tipo_Documento = Tipo_Documento;
        this.Num_Documento = Num_Documento;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Año_Ingreso = Año_Ingreso;
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getCod_Estudiantes() {
        return Cod_Estudiantes;
    }

    public void setCod_Estudiantes(int Cod_Estudiantes) {
        this.Cod_Estudiantes = Cod_Estudiantes;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getP_apellido() {
        return P_apellido;
    }

    public void setP_apellido(String P_apellido) {
        this.P_apellido = P_apellido;
    }

    public String getS_apellido() {
        return S_apellido;
    }

    public void setS_apellido(String S_apellido) {
        this.S_apellido = S_apellido;
    }

    public String getTipo_Documento() {
        return Tipo_Documento;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }

    public String getNum_Documento() {
        return Num_Documento;
    }

    public void setNum_Documento(String Num_Documento) {
        this.Num_Documento = Num_Documento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getAño_Ingreso() {
        return Año_Ingreso;
    }

    public void setAño_Ingreso(String Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    
    
    }

    