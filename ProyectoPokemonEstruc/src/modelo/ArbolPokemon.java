/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josem
 */
public class ArbolPokemon {
    private NodoArbolPokemon raiz;

    public void insertar(Pokemon nuevo) {
        raiz = insertarRecursivo(raiz, nuevo);
    }

    private NodoArbolPokemon insertarRecursivo(NodoArbolPokemon actual, Pokemon nuevo) {
        if (actual == null) {
            return new NodoArbolPokemon(nuevo);
        }

        if (nuevo.getCodigoPokemon() < actual.getPokemon().getCodigoPokemon()) {
            actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), nuevo));
        } else if (nuevo.getCodigoPokemon() > actual.getPokemon().getCodigoPokemon()) {
            actual.setDerecho(insertarRecursivo(actual.getDerecho(), nuevo));
        }
        return actual;
    }

    public Pokemon buscar(int codigo) {
        NodoArbolPokemon nodo = buscarRecursivo(raiz, codigo);
        return nodo != null ? nodo.getPokemon() : null;
    }

    private NodoArbolPokemon buscarRecursivo(NodoArbolPokemon actual, int codigo) {
        if (actual == null || actual.getPokemon().getCodigoPokemon() == codigo) {
            return actual;
        }

        if (codigo < actual.getPokemon().getCodigoPokemon()) {
            return buscarRecursivo(actual.getIzquierdo(), codigo);
        } else {
            return buscarRecursivo(actual.getDerecho(), codigo);
        }
    }

    public void mostrarInOrden() {
        inOrden(raiz);
    }

    private void inOrden(NodoArbolPokemon nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzquierdo());
            System.out.println("Código: " + nodo.getPokemon().getCodigoPokemon() + 
                               ", Nombre: " + nodo.getPokemon().getNombre());
            inOrden(nodo.getDerecho());
        }
    }
}
