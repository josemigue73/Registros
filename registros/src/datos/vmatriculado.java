/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author USUARIO
 */
public class vmatriculado {
    private int idMatricula;  
    private int Cod_Estudiantes;
    private String Año_Matricula;
    private String Grado;
    private String Grupo; 

    public vmatriculado() {
    }

    public vmatriculado(int idMatricula, int Cod_Estudiantes, String Año_Matricula, String Grado, String Grupo) {
        this.idMatricula = idMatricula;
        this.Cod_Estudiantes = Cod_Estudiantes;
        this.Año_Matricula = Año_Matricula;
        this.Grado = Grado;
        this.Grupo = Grupo;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getCod_Estudiantes() {
        return Cod_Estudiantes;
    }

    public void setCod_Estudiantes(int Cod_Estudiantes) {
        this.Cod_Estudiantes = Cod_Estudiantes;
    }

    public String getAño_Matricula() {
        return Año_Matricula;
    }

    public void setAño_Matricula(String Año_Matricula) {
        this.Año_Matricula = Año_Matricula;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

   
}
