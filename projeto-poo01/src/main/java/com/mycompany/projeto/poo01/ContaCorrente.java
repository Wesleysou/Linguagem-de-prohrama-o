package com.mycompany.projeto.poo01;
public class ContaCorrente {
    
    //Declarando as caracteristicas da nossa conta
    //Atributos
    String titular;
    Double saldo;
    
    //Declarar os comportamentos || habilidades da nissa conta.
    //metodos
    
    void depositar(Integer valor){
        saldo+= valor;   
    }
    
    void sacar(Integer sacar){
         saldo -= sacar;
    }
}
