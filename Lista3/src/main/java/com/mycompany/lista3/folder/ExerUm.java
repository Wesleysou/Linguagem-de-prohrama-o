/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3.folder;

import java.util.Scanner;
import jdk.jshell.execution.Util;

/**
 *
 * @author aluno
 */
public class ExerUm {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        Integer nota1 = leitor.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        Integer nota2 = leitor.nextInt();
               
       metodosExers result = new metodosExers();
       Double mediaFinal = result.mediaBandtec(nota1, nota2);
       
        System.out.println(mediaFinal);
       
      
    }
          
    
}
