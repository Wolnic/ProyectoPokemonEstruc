
package modelo;



/**
 *
 * @author  *
 * Ocampo Pantoja José Mario  *
 * Sánchez Venegas Manuel Antonio  *
 * Delgado Jiménez Alexander  *
 * Cordoba Hernandez Giovanny Josue  *
 * Pérez Rodríguez Carlos Roberto  *
 */
public class NodoPokemon {
    private Pokemon pokemon;
    private NodoPokemon siguiente;

    public NodoPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.siguiente = null;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public NodoPokemon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPokemon siguiente) {
        this.siguiente = siguiente;
    }
        }
