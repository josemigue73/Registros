/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros.Datos;

import java.sql.Date;


/**
 *
 *
 */
public class ClaseEstudiantes {
     
    
    private int Cod_Estudiantes;
    private String Nombres;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private String Tipo_Documento;
    private String Num_Documento;
    private String Telefono;
    private String Direccion;    
    private String Año_Ingreso;
    private String Fecha_nacimiento;
   
   
    

    public ClaseEstudiantes() {
        
    }

    public ClaseEstudiantes(int Cod_Estudiantes, String Nombres, String Primer_Apellido, String Segundo_Apellido, String Tipo_Documento, String Num_Documento, String Telefono, String Direccion, String Año_Ingreso, String Fecha_nacimiento) {
        this.Cod_Estudiantes = Cod_Estudiantes;
        this.Nombres = Nombres;
        this.Primer_Apellido = Primer_Apellido;
        this.Segundo_Apellido = Segundo_Apellido;
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

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
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

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    
    
    }

    