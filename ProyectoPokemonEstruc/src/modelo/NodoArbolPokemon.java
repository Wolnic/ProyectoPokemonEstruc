/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josem
 */
public class NodoArbolPokemon {
    private Pokemon pokemon;
    private NodoArbolPokemon izquierdo;
    private NodoArbolPokemon derecho;

    public NodoArbolPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public NodoArbolPokemon getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbolPokemon izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbolPokemon getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbolPokemon derecho) {
        this.derecho = derecho;
    }
}