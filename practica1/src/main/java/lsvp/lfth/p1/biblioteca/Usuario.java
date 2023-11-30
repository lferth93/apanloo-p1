package lsvp.lfth.p1.biblioteca;

public class Usuario {
    String id;
    String nombre;
    String apellidoP;
    String appellidoM;
    Fecha fNacimiento;
    public Usuario(String nombre, String apellidoP, String appellidoM, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.appellidoM = appellidoM;
        this.fNacimiento = fNacimiento;
    }
    public Usuario() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getAppellidoM() {
        return appellidoM;
    }
    public void setAppellidoM(String appellidoM) {
        this.appellidoM = appellidoM;
    }
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
}
