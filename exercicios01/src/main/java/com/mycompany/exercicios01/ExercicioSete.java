package com.mycompany.exercicios01;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer contadorPar = 0;
        Integer contadorImpar = 0;

        for (int i = 0; i <= 200; i++) {
            Integer numeroRandom = ThreadLocalRandom.current().nextInt(1, 201);

            if (Objects.equals(numeroRandom, numeroDigitado)) {
                System.out.print(numeroDigitado);
            }
            if (numeroRandom % 2 == 0) {
                contadorPar++;
            }
            if (numeroRandom % 2 != 0) {
                contadorImpar++;
            }

        }

        System.out.println("Numero(s) par: " + contadorImpar);
        System.out.println("Numero(s) par: " + contadorPar);
    }

}
