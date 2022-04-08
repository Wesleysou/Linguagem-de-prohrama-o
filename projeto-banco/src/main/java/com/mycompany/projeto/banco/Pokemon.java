package com.mycompany.projeto.banco;

public class Pokemon {
    
    private Integer ID;
    private String nome;
    private String tipo;

    public Pokemon(Integer ID, String nome, String tipo) {
        this.ID = ID;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Pokemon() {
        
    }

    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    

    @Override
    public String toString() {
        return "Pokemon{" + "ID=" + ID + ", nome=" + nome + ", tipo=" + tipo + '}';
    }
    
   
    
}