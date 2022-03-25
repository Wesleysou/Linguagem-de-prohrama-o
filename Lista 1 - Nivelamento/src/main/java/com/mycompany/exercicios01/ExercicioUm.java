package com.mycompany.exercicios01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExercicioUm{
    
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer contador = 0;
        Integer numeroRandom = ThreadLocalRandom.current().nextInt(1, 11);
        
     while(numeroDigitado != numeroRandom){
         
         System.out.println("O numero era: " + numeroRandom);
         System.out.println("Digite um novo numero");
         numeroDigitado = leitor.nextInt();
         
         numeroRandom = ThreadLocalRandom.current().nextInt(1, 11);            
         contador ++;
         
        }
     
     if(contador < 3){
         System.out.println("Você tem muita sorte");
     }else if (contador > 3 && contador <= 10){
            System.out.println("Você é sortudo");   
     }else{
         System.out.println("É melhor você parar de apostar e ir trabalhar");
     }
         
     
    }
 
}
