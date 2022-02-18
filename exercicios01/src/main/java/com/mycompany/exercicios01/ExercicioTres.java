package com.mycompany.exercicios01;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do Usuario:");
        String nomeUser = leitor.nextLine();
        
        System.out.println("Digite a Senha:");
        String senhaUser = leitor.nextLine();
        
        while(!"admin".equals(nomeUser) || !"#Bandtec".equals(senhaUser)){
        System.out.println("Senha/Usuario incorreto(s)");
        
        System.out.println("Digite o nome do Usuario:");
        nomeUser = leitor.nextLine();
        
        System.out.println("Digite a Senha:");
        senhaUser = leitor.nextLine();
        
        }
        
        System.out.println("Seja Bem-vindo");
    }
}
