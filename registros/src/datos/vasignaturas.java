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
public class vasignaturas {
    private int IdAsignatura;
    private String Cod_Asignatura;
    private String Nom_Asignatura;
    private int Int_Horaria;
    private String Grado;

    public vasignaturas() {
    }

    public vasignaturas(int IdAsignatura, String Cod_Asignatura, String Nom_Asignatura, int Int_Horaria, String Grado) {
        this.IdAsignatura = IdAsignatura;
        this.Cod_Asignatura = Cod_Asignatura;
        this.Nom_Asignatura = Nom_Asignatura;
        this.Int_Horaria = Int_Horaria;
        this.Grado = Grado;
    }

    public int getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(int IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public String getCod_Asignatura() {
        return Cod_Asignatura;
    }

    public void setCod_Asignatura(String Cod_Asignatura) {
        this.Cod_Asignatura = Cod_Asignatura;
    }

    public String getNom_Asignatura() {
        return Nom_Asignatura;
    }

    public void setNom_Asignatura(String Nom_Asignatura) {
        this.Nom_Asignatura = Nom_Asignatura;
    }

    public int getInt_Horaria() {
        return Int_Horaria;
    }

    public void setInt_Horaria(int Int_Horaria) {
        this.Int_Horaria = Int_Horaria;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

   
}
