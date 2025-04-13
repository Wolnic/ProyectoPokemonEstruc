package modelo;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class Entrenador {

    private String nombre;
    private boolean esUsuario;

    public Entrenador(String nombre, boolean esUsuario) {
        this.nombre = nombre;
        this.esUsuario = esUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esUsuario() {
        return esUsuario;
    }
}
