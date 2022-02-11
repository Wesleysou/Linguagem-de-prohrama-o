/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

//import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Interpolacao {
    public static void main(String[] args) {
        
//        Scanner leitor = new Scanner(System.in);
        
        String nome = "Maria";
        Integer idade = 38;
        Double altura = 1.65;
        
        
        System.out.println("Meu nome é " +nome+ " Tenho " +idade+ " de idade e "
                +altura+" de altura");
        
        System.out.println(String.format("Meu nome é %s, tenho %d anos, %.2f de"
                + " altura", nome, idade, altura));
         
        
    }
    
}
