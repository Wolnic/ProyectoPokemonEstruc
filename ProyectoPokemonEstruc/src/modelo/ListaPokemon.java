package modelo;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class ListaPokemon {

    private NodoPokemon cabeza;

    public ListaPokemon() {
        cabeza = null;
    }

    // Agregar un Pokémon a la lista
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

    // Obtener la cabeza de la lista
    public NodoPokemon getCabeza() {
        return cabeza;
    }

    // Establecer la cabeza de la lista
    public void setCabeza(NodoPokemon cabeza) {
        this.cabeza = cabeza;
    }

    // Filtrar los Pokémon por tipo y devolver una nueva lista con los Pokémon filtrados
    public ListaPokemon cargarPorTipo(String tipoDeseado) {
        ListaPokemon listaFiltrada = new ListaPokemon();
        NodoPokemon actual = cabeza;  // Comienza desde la cabeza de la lista original

        while (actual != null) {
            Pokemon p = actual.getPokemon();
            if (p.getTipo().equalsIgnoreCase(tipoDeseado)) {
                listaFiltrada.agregarPokemon(p);
            }
            actual = actual.getSiguiente();
        }

        return listaFiltrada;
    }
}