package lsvp.lfth.p1.biblioteca;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    public static Fecha hoy(){
        return new Fecha(((Calendar)Calendar.getInstance().clone()));
    }

    Calendar fecha;

    public Fecha(int dia, int mes, int anio){
        fecha = new GregorianCalendar(dia, mes - 1, anio);
    }

    public Fecha(Calendar fecha){
       this.fecha = fecha; 
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(fecha.get(GregorianCalendar.DAY_OF_MONTH)+"/");
        sb.append(fecha.get((GregorianCalendar.MONTH)+1)+"/");
        sb.append(fecha.get(GregorianCalendar.YEAR));
        return sb.toString();
    }

    public Fecha add(int dias){
        GregorianCalendar f2 = (GregorianCalendar)fecha.clone();
        f2.add(GregorianCalendar.DATE, dias);
        return new Fecha(f2);
    }
}
