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
public class Entrenador {
    private String Nombre;
    private ListaPokemon ListaPokemon;
    
    public void CrearEntrenador(String Nombre,ListaPokemon Lista){
        this.Nombre=Nombre;
        this.ListaPokemon=Lista;
    }
    
    public void SeleccionarPokemon(){
        ListaPokemon.MostrarLista();
    }
    
    public void CambiarPokemon(){
        
    }
    
    public void Atacar(Pokemon Enemigo){
        
    }
}
