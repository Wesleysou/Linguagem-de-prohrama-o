/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios01;

import java.util.Scanner;

public class ExerDez {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("---- DIGITE O SEU SABOR PREFERIDO ----");
        System.out.println("----  5 Para votar no sabor mussarela ----");
        System.out.println("----  25 Para votar no sabor calabresa ----");
        System.out.println("---- 50 Para votar no sabor quatro queijos ----");

        Integer numeroMussarela = 0;
        Integer numeroCalabresa = 0;
        Integer numeroQueijos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor: ");
            Integer numeroPizza = leitor.nextInt();

            if (numeroPizza == 5) {
                numeroMussarela++;
            }
            if (numeroPizza == 25) {
                numeroCalabresa++;
            }
            if (numeroPizza == 50) {
                numeroQueijos++;
            }
}

            if (numeroCalabresa > numeroMussarela && numeroCalabresa > numeroQueijos) {
                System.out.println("Calabresa é o favorito");

            }
            if (numeroMussarela > numeroCalabresa && numeroMussarela > numeroQueijos) {
                System.out.println("Mussarela é o favorito");

            } else {
                System.out.println("Queijo é o favorito");
            }
        
    }

}
