
package modelo;

/**
 *
 * @author JUser
 */
public class CargadorDePokemon {

    // Cargar la lista completa de Pokémon
    public ListaPokemon cargar() {
        ListaPokemon lista = new ListaPokemon();

        // Fuego
        agregarPokemon(lista, new Pokemon("Charizard", "Fuego", 78, 84, 78, 109, 85));
        agregarPokemon(lista, new Pokemon("Blaziken", "Fuego", 80, 120, 70, 110, 70));
        agregarPokemon(lista, new Pokemon("Volcarona", "Fuego", 85, 60, 65, 135, 105));
        agregarPokemon(lista, new Pokemon("Arcanine", "Fuego", 90, 110, 80, 100, 80));

        // Agua
        agregarPokemon(lista, new Pokemon("Greninja", "Agua", 72, 95, 67, 103, 71));
        agregarPokemon(lista, new Pokemon("Cloyster", "Agua", 50, 95, 180, 85, 45));
        agregarPokemon(lista, new Pokemon("Empoleon", "Agua", 84, 86, 88, 111, 101));
        agregarPokemon(lista, new Pokemon("Blastoise", "Agua", 79, 83, 100, 85, 105));

        // Normal
        agregarPokemon(lista, new Pokemon("Staraptor", "Normal", 85, 120, 70, 50, 60));
        agregarPokemon(lista, new Pokemon("Snorlax", "Normal", 160, 110, 65, 65, 110));
        agregarPokemon(lista, new Pokemon("Mewtwo", "Normal", 106, 110, 90, 154, 90));
        agregarPokemon(lista, new Pokemon("Bulbasaur", "Normal", 45, 49, 49, 65, 65));

        return lista;
    }

    // Método privado para agregar Pokémon a la lista
    private void agregarPokemon(ListaPokemon lista, Pokemon pokemon) {
        NodoPokemon nuevoNodo = new NodoPokemon(pokemon);

        if (lista.getCabeza() == null) {
            lista.setCabeza(nuevoNodo);
        } else {
            // Si la lista no está vacía, agregamos el nodo al final
            NodoPokemon actual = lista.getCabeza();
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }
}