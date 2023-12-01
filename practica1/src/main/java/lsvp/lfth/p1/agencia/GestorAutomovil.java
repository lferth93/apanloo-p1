package lsvp.lfth.p1.agencia;

public interface GestorAutomovil {
    void agregarAutomovil(Automovil a);
    boolean consultarAutomovil(Modelo m);
    boolean consultarAutomovil(Modelo m, Color c);
    Automovil[] consultarInAutomovil(Modelo m);
    Automovil[] consultarInAutomovil(Modelo m, Color c);
    void actualizarAutomovil(String id, Automovil a);
    void eliminarAutomovil(Modelo m);
    void eliminarAutomovil(Modelo m, Color c);
}
