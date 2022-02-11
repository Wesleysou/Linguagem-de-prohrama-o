/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

/**
 *        Double vezesQuepodeUltilizar = saldo / 4.40;

 * @author aluno
 */
public class PassagemMetro {
    
    public static void main(String[] args) {
        String usuario = "Maria";
        Double saldo = 250.5;
        Double vezesQuepodeUltilizar = saldo / 4.40;
        
        System.out.println(String.format("Olá, %s você pode usar o metro %d vezes"
                , usuario, vezesQuepodeUltilizar.intValue() ));
    }
    
}
