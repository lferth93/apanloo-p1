package lsvp.lfth.p1.biblioteca;

import java.util.GregorianCalendar;

public class Fecha {
    GregorianCalendar fecha;

    public Fecha(int dia, int mes, int anio){
        fecha = new GregorianCalendar(dia, mes - 1, anio);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(fecha.get(GregorianCalendar.DAY_OF_MONTH)+"/");
        sb.append(fecha.get((GregorianCalendar.MONTH)+1)+"/");
        sb.append(fecha.get(GregorianCalendar.YEAR));
        return sb.toString();
    }

}
