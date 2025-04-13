package modelo;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class NodoTorneo {

    private Entrenador entrenador;
    private NodoTorneo izquierda;
    private NodoTorneo derecha;

    public NodoTorneo(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public NodoTorneo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoTorneo izquierda) {
        this.izquierda = izquierda;
    }

    public NodoTorneo getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoTorneo derecha) {
        this.derecha = derecha;
    }
}
