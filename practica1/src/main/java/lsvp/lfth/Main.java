package lsvp.lfth;
import lsvp.lfth.p1.simples.Realizacion.Automovil;
import lsvp.lfth.p1.simples.Realizacion.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Automovil();
        v.arrancar();
        v.acelerar();
        v.detener();      
    }
}