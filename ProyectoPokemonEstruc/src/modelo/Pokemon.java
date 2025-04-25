
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

public class Pokemon {
    private String nombre;
    private String tipo;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    // Constructor
    public Pokemon(String nombre, String tipo, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
    }

    // Getters y setters, si los necesitas
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }
}