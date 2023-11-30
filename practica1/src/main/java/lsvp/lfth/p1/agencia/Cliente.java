package lsvp.lfth.p1.agencia;

import java.util.GregorianCalendar;

public class Cliente {
    String curp;
    String apellidoP;
    String apellidoM;
    GregorianCalendar fNacimiento;
    
    public Cliente() {
    }

    public Cliente(String curp, String apellidoP, String apellidoM, GregorianCalendar fNacimiento) {
        this.curp = curp;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fNacimiento = fNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public GregorianCalendar getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(GregorianCalendar fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

}
