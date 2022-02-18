package com.mycompany.exercicios01;

import java.util.Scanner;

public class ExerNove {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double numeroUm = 0.15;
        Double numeroDois = 0.15;

        for (; numeroUm <= 4.95;) {

            numeroUm += numeroDois;
            System.out.println(String.format("Numero: %.2f", numeroUm));

        }
    }

}
