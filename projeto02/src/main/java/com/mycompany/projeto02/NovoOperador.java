package com.mycompany.projeto02;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class NovoOperador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Wesley Monteiro";
                
        Boolean isAluno = true;
        
              
        if (isAluno) {
            
              System.out.println("È Professor");
              
        } else{
                    
            System.out.println("Não é professor");
        }
        
      String resultado = isAluno ? "Sim" : "Não";    
    
      
      // Exemplo de Ternario
      Integer nota = 10;
      String feedback = nota >6? "Passou" : "Reprovou";
      
      
    }
    
}
