/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LacosRepeticao {

    public static void main(String[] args) {

        System.out.println("------- Exemplo 01 -------");

        Scanner leitor = new Scanner(System.in);
        for (Integer i = 10; i > 0; i--) {
            System.out.println(String.format("Número; %d", i));
        }

        System.out.println("------- Exemplo 02 -------");

        for (Integer i = 0; i <= 10; i++) {
            System.out.println(String.format("Número; %d", i));
        }

        System.out.println("------- Exemplo 03 -------");

        System.out.println("Acerte o numero");
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado != 42) {

            System.out.println("Errou.......tente novamente");
            numeroDigitado = leitor.nextInt();
        }

        System.out.println("Acertou!!!!!!!!!!!!!");

        System.out.println("-------Exemplo 04-------");

        Integer contador = 0;
        while (contador <= 10) {

            System.out.println(String.format("Contador: %d", contador));

            contador++;
        }
        
        System.out.println("------- Exemplo 05 -------");
        
        Integer cntador = 10;
        
        while (cntador >= 0) {

            System.out.println(String.format("Contador: %d", cntador));
            cntador--;
        }
        
        System.out.println("------- Exemplo 06 -------");
        
        Integer numeroDigitado1;
        
        do {
            System.out.println("Acerte o número (do while)");
            numeroDigitado1 = leitor.nextInt();
        }while (numeroDigitado1 != 42);
        
        System.out.println("Parabéns!!!!!!!!!");
    }

}
