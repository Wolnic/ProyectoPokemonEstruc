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
public class Pokemon {
    private String Nombre;
    private String Tipo;
    private int Vida;
    private int Ataque;
    private int Defensa;
    private int AtaqueEspecial;
    private int DefensaEspecial;
    private int CodigoPokemon;
    
    public void CrearPokemon(String Nombre,String Tipo,int Codigo){
        this.Nombre=Nombre;
        this.CodigoPokemon=Codigo;
        if(Tipo.equals("Normal")){
            this.Tipo="Normal";
            this.Vida=150;
            this.Ataque=50;
            this.Defensa=35;
            this.AtaqueEspecial=70;
            this.DefensaEspecial=60;
        }
        if(Tipo.equals("Agua")){
            this.Tipo="Agua";
            this.Vida=190;
            this.Ataque=55;
            this.Defensa=45;
            this.AtaqueEspecial=75;
            this.DefensaEspecial=65;
        }
        if(Tipo.equals("Fuego")){
            this.Tipo="Fuego";
            this.Vida=115;
            this.Ataque=70;
            this.Defensa=45;
            this.AtaqueEspecial=80;
            this.DefensaEspecial=60;
        }
    }
    
    public void Atacar(Pokemon Enemigo,Pokemon Pokemon){
        Enemigo.Vida=Enemigo.Vida-Pokemon.Ataque;
    }
    
    public void AtaqueEspecial(Pokemon Enemigo,Pokemon Pokemon){
        if(Pokemon.Tipo.equals("Normal")){
            if(Enemigo.Tipo.equals("Agua")){
                Enemigo.Vida=Enemigo.Vida-75;
            }
            else{
                Enemigo.Vida=Enemigo.Vida-Pokemon.AtaqueEspecial;
            }
        }
        if(Pokemon.Tipo.equals("Fuego")){
            if(Enemigo.Tipo.equals("Normal")){
                Enemigo.Vida=Enemigo.Vida-85;
            }
            else{
                Enemigo.Vida=Enemigo.Vida-Pokemon.AtaqueEspecial;
            }
        }
        if(Pokemon.Tipo.equals("Agua")){
            if(Enemigo.Tipo.equals("Fuego")){
                Enemigo.Vida=Enemigo.Vida-85;
            }
            else{
                Enemigo.Vida=Enemigo.Vida-Pokemon.AtaqueEspecial;
            }
        }
    }
    
    public void RecibirAtaque(Pokemon Enemigo,Pokemon Pokemon){
        Pokemon.Vida=Pokemon.Vida-Enemigo.Ataque;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(int AtaqueEspecial) {
        this.AtaqueEspecial = AtaqueEspecial;
    }

    public int getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(int DefensaEspecial) {
        this.DefensaEspecial = DefensaEspecial;
    }

    public int getCodigoPokemon() {
        return CodigoPokemon;
    }

    public void setCodigoPokemon(int CodigoPokemon) {
        this.CodigoPokemon = CodigoPokemon;
    }
    
    
}

