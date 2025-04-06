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
public class NodoPokemon {
    public Pokemon Pokemon;
    public NodoPokemon Siguiente;
    
    public NodoPokemon(Pokemon pokemon){
        this.Pokemon=pokemon;
        this.Siguiente=null;
    }

    public Pokemon getPokemon() {
        return Pokemon;
    }

    public void setPokemon(Pokemon Pokemon) {
        this.Pokemon = Pokemon;
    }

    public NodoPokemon getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoPokemon Siguiente) {
        this.Siguiente = Siguiente;
    }
    
    
}
