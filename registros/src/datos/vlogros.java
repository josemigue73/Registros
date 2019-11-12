/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author davricar
 */
public class vlogros {
    
    private int IdLogros;
    private String Cod_Asignatura;
    private String Descripcion;
    private String Grado;
    

    
    public vlogros() {
    }

    public vlogros(int IdLogros, String Cod_Asignatura, String Descripcion, String Grado) {
        this.IdLogros = IdLogros;
        this.Cod_Asignatura = Cod_Asignatura;
        this.Descripcion = Descripcion;
        this.Grado = Grado;
    }

    public int getIdLogros() {
        return IdLogros;
    }

    public void setIdLogros(int IdLogros) {
        this.IdLogros = IdLogros;
    }

    public String getCod_Asignatura() {
        return Cod_Asignatura;
    }

    public void setCod_Asignatura(String Cod_Asignatura) {
        this.Cod_Asignatura = Cod_Asignatura;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

   
        
}
