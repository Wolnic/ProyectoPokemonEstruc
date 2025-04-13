
package modelo;

/**
 @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class NodoListaEntrenador {
    private Entrenador entrenador;
    private NodoListaEntrenador siguiente;

    public NodoListaEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
        this.siguiente = null;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public NodoListaEntrenador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaEntrenador siguiente) {
        this.siguiente = siguiente;
    }
}
