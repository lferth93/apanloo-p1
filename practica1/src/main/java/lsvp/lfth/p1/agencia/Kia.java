package lsvp.lfth.p1.agencia;

import java.util.ArrayList;
import java.util.HashMap;

public class Kia implements AgenciaAutomovil{
    HashMap<String, Cliente> clientes;
    HashMap<Modelo,HashMap<Color,HashMap<String,Automovil>>> automoviles;
    HashMap<String,Automovil> autosId;

    public Kia() {
        clientes = new HashMap<>();
        automoviles = new HashMap<>();
        autosId = new HashMap<>();
    }

    @Override
    public void agregarAutomovil(Automovil a) {
        autosId.put(a.serie, a);
        if(!automoviles.containsKey(a.getModelo()))
            automoviles.put(a.getModelo(), new HashMap<>());
        if (!automoviles.get(a.getModelo()).containsKey(a.color))
            automoviles.get(a.getModelo()).put(a.getColor(), new HashMap<>());
        automoviles.get(a.getModelo()).get(a.getColor()).put(a.serie,a);
    }

    @Override
    public boolean consultarAutomovil(Modelo m) {
        return automoviles.containsKey(m);
    }

    @Override
    public boolean consultarAutomovil(Modelo m, Color c) {
        return automoviles.containsKey(m) && automoviles.get(m).containsKey(c);
    }

    @Override
    public Automovil[] consultarInAutomovil(Modelo m) {
        if(!automoviles.containsKey(m))
            return null;
        ArrayList<Automovil> array = new ArrayList<>();
        for(HashMap<String,Automovil> autos: automoviles.get(m).values()){
            array.addAll(autos.values());
        }
        return ((Automovil[])array.toArray());
    }

    @Override
    public Automovil[] consultarInAutomovil(Modelo m, Color c) {
        if(automoviles.containsKey(m) && automoviles.get(m).containsKey(c))
            return ((Automovil[])automoviles.get(m).get(c).values().toArray());
        return null;
    }

    @Override
    public void actualizarAutomovil(String id, Automovil a) {
        eliminarAutomovil(id);
        agregarAutomovil(a);
    }

    public void eliminarAutomovil(String id){
        Automovil auto = autosId.get(id);
        automoviles.get(auto.getModelo()).get(auto.getColor()).remove(auto.serie);
        if(automoviles.get(auto.getModelo()).get(auto.getColor()).isEmpty())
            automoviles.get(auto.getModelo()).remove(auto.getColor()); 
        if(automoviles.get(auto.getModelo()).isEmpty())
            automoviles.remove(auto.getModelo());
        
        autosId.remove(auto.serie);
    }


    @Override
    public void eliminarAutomovil(Modelo m) {
        automoviles.remove(m);
    }

    @Override
    public void eliminarAutomovil(Modelo m, Color c) {
        if(automoviles.containsKey(m))
            automoviles.get(m).remove(c);
    }


    @Override
    public void agregarCliente(Cliente c) {
        clientes.put(c.curp, c);
    }

    @Override
    public Cliente consultarCliente(String id) {
        return clientes.get(id);
    }

    @Override
    public Cliente eliminarCliente(String id) {
        return clientes.remove(id);
    }
}
