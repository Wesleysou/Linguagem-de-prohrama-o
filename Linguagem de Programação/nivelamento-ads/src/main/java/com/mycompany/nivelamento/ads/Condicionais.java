/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

import java.util.Scanner;
import jdk.nashorn.api.tree.IfTree;

/**
 *
 * @author aluno
 */
public class Condicionais {

    public static void main(String[] args) {
        Integer numero = 42;System.out.println("Digite um numero");
//        Integer numeroDigitado = leitor.nextInt();
//
//        if (numero > numeroDigitado) {
//            System.out.println("O numero digitado é menor que o "
//                    + "numero da nuvem!!!");
//        } else if (numero < numeroDigitado) {
//            System.out.println("O numero digitado e maior que o numero "
//                    + "da nvem!!!");
//        }else
//            System.out.println("Você digitou 42!!!");


        Scanner leitor = new Scanner  (System.in);

//        System.out.println("Digite um numero");
//        Integer numeroDigitado = leitor.nextInt();
//
//        if (numero > numeroDigitado) {
//            System.out.println("O numero digitado é menor que o "
//                    + "numero da nuvem!!!");
//        } else if (numero < numeroDigitado) {
//            System.out.println("O numero digitado e maior que o numero "
//                    + "da nvem!!!");
//        }else
//            System.out.println("Você digitou 42!!!");

        
        String nome = "matheus";
        System.out.println("Digite matheus");
        String nome2 = leitor.nextLine();
        
        if (nome.equals(nome2)) {
            System.out.println("È igual");
        }else 
            System.out.println("è não");
        
        
        Boolean ligado = true;
        
        if (ligado) {
             System.out.println("Ligado");            
        }else
            System.out.println("Desligado");
    }
   
}
