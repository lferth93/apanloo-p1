package lsvp.lfth.p1.agencia;

public interface GestorCliente {
    void agregarCliente(Cliente c);
    Cliente consultarCliente(String id);
    Cliente eliminarCliente(String id);
}
