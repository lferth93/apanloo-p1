package lsvp.lfth.p1.simples.realizacion;

public class Automovil implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("El automóvil está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El automóvil se ha detenido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El automóvil está acelerando");
    }
    
}
