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
    private NodoPokemon Cabeza;
    private int Cantidad;
    private final int MaxPokemon=4;
    
    public ListaPokemon(){
        this.Cabeza=null;
        this.Cantidad=0;
    }
    public void AgregarPokemon(Pokemon pokemon){
        NodoPokemon NuevoNodo=new NodoPokemon(pokemon);
        if(Cantidad>=MaxPokemon){
            
        }
        else{
            NodoPokemon Actual=Cabeza;
            
            while(Actual.Siguiente!=null){
                Actual=Actual.Siguiente;
            }
            Actual.Siguiente=NuevoNodo;
        }
        Cantidad++;
    }
    
    public void MostrarLista(){
        NodoPokemon Actual=Cabeza;
        String Texto="Lista de Pokemon:\n";
        String Linea="";
        while(Actual!=null){
            Linea="Nombre:"+Actual.Pokemon.getNombre()+"\nVida:"+Actual.Pokemon.getVida()+"\nTipo:"+Actual.Pokemon.getTipo()+"\nAtaque:"+Actual.Pokemon.getAtaque()+"\nDefensa:"+Actual.Pokemon.getDefensa()+"\nAtaque Especial:"+Actual.Pokemon.getAtaqueEspecial()+"\nDefensa Especial:"+Actual.Pokemon.getDefensaEspecial()+"\n\n";
            Texto=Texto+Linea;
            Actual=Actual.Siguiente;
        }
    }
}