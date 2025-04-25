package modelo;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class ListaPokemon {
    private int Cantidad;
    private String Nombre;

    private NodoPokemon cabeza;

    public ListaPokemon() {
        cabeza = null;
    }

    public boolean agregarPokemon(Pokemon pokemon) {
        if (pokemon == null) {
            return false;
        }

        NodoPokemon nuevoNodo = new NodoPokemon(pokemon);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            return true;
        }

        NodoPokemon temp = cabeza;
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }

        temp.setSiguiente(nuevoNodo);
        return true;
    }

    public NodoPokemon getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPokemon cabeza) {
        this.cabeza = cabeza;
    }

    public ListaPokemon cargarPorTipo(String tipoDeseado) {
        ListaPokemon listaFiltrada = new ListaPokemon();
        NodoPokemon actual = cabeza;  

        while (actual != null) {
            Pokemon p = actual.getPokemon();
            if (p.getTipo().equalsIgnoreCase(tipoDeseado)) {
                listaFiltrada.agregarPokemon(p);
            }
            actual = actual.getSiguiente();
        }

        return listaFiltrada;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public Pokemon obtenerPokemon(int i) {
    if (i < 0) {
        return null;     }

    NodoPokemon actual = cabeza;
    int contador = 0;

    while (actual != null) {
        if (contador == i) {
            return actual.getPokemon(); 
        }
        actual = actual.getSiguiente();
        contador++;
    }

    return null; 
}

    public String getNombre() {
        return Nombre;
    }
    
    
}