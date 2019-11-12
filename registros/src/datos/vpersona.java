package Datos;


public class vpersona {
    private int idpersona;
    private String Nombres;
    private String P_apellido;
    private String S_apellido;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;

    public vpersona() {
    }

    public vpersona(int idpersona, String Nombres, String P_apellido, String S_apellido, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        this.idpersona = idpersona;
        this.Nombres = Nombres;
        this.P_apellido = P_apellido;
        this.S_apellido = S_apellido;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
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

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
     
    
}
