package com.mycompany.exercicios01;

import java.util.Scanner;

public class ExercicioDois {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Digite um número: ");
         Integer numeroDigitado = leitor.nextInt();
         Integer resultadoNumero = numeroDigitado;
         
         while (numeroDigitado != 0){
         System.out.println("Digite outro numero: ");
         numeroDigitado = leitor.nextInt();
         
         resultadoNumero += numeroDigitado;
         }
          
         System.out.println("A somatoria doa numeros é: " + resultadoNumero);
               
    }
    
}
