/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ListaPokemon {
        private NodoPokemon cabeza;
    private int cantidad;
    private final int maxPokemon = 4;

    public ListaPokemon() {
        this.cabeza = null;
        this.cantidad = 0;
    }

    public boolean agregarPokemon(Pokemon pokemon) {
        if (cantidad >= maxPokemon) {
            System.out.println("No se puede agregar más Pokémon. Límite alcanzado.");
            return false;
        }

        NodoPokemon nuevoNodo = new NodoPokemon(pokemon);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoPokemon actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }

        cantidad++;
        return true;
    }

    public String mostrarLista() {
        NodoPokemon actual = cabeza;
        StringBuilder texto = new StringBuilder("Lista de Pokémon:\n");

        while (actual != null) {
            Pokemon p = actual.getPokemon();
            texto.append("Nombre: ").append(p.getNombre())
                  .append("\nTipo: ").append(p.getTipo())
                  .append("\nVida: ").append(p.getVida())
                  .append("\nAtaque: ").append(p.getAtaque())
                  .append("\nDefensa: ").append(p.getDefensa())
                  .append("\nAtaque Especial: ").append(p.getAtaqueEspecial())
                  .append("\nDefensa Especial: ").append(p.getDefensaEspecial())
                  .append("\n\n");
            actual = actual.getSiguiente();
        }

        return texto.toString();
    }

    public Pokemon obtenerPokemon(int index) {
        if (index < 0 || index >= cantidad) return null;
        NodoPokemon actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (contador == index) return actual.getPokemon();
            actual = actual.getSiguiente();
            contador++;
        }
        return null;
    }

    public int getCantidad() {
        return cantidad;
    }
}