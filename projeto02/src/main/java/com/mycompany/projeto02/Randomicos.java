package com.mycompany.projeto02;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        //Math.random() * 100
        // Existe o metodo randm que é igual ao t
        Scanner in = new Scanner(System.in);
        Random random = new Random();  // <------ podemos gerar ojetos 
        //aleatorios da classe random
 
        random.nextInt();
        Integer numeroGerado =  ThreadLocalRandom.current().nextInt(1, 101);
        //Aqui vai de 1 a 101 
        //pois o ultimo numero e exclisivo enquanto o primeiro e inclusivo 
        System.out.println("O numero g foi: " + numeroGerado);
        
        String teste = numeroGerado.toString();
        Integer numeroConvertido = Integer.valueOf("10");
        
    }
    
}
