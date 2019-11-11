/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Sangrosferatus
 */
public class cprofesores {
    private int Cod_Profesor;
    private String Docente;
    private int Num_Documento;

    public cprofesores() {
    }

    public cprofesores(int Cod_Profesor, String Docente, int Num_Documento) {
        this.Cod_Profesor = Cod_Profesor;
        this.Docente = Docente;
        this.Num_Documento = Num_Documento;
    }

    public int getCod_Profesor() {
        return Cod_Profesor;
    }

    public void setCod_Profesor(int Cod_Profesor) {
        this.Cod_Profesor = Cod_Profesor;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

    public int getNum_Documento() {
        return Num_Documento;
    }

    public void setNum_Documento(int Num_Documento) {
        this.Num_Documento = Num_Documento;
    }

    
      
}

  
