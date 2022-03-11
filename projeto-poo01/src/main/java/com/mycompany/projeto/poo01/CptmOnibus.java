package com.mycompany.projeto.poo01;

import java.util.Scanner;

public class CptmOnibus {

    public static void main(String[] args) {
        Bilhete Usuario1 = new Bilhete();
        Scanner leitor = new Scanner(System.in);
        Usuario1.titular = "Wesley";
        
        
        System.out.println("Digite o valor a ser carregado");
        Double valorRecarga = leitor.nextDouble();
        Usuario1.carregar(valorRecarga);
        System.out.println("O saldo atual é " + Usuario1.saldo);        
        
        
        System.out.println("Quantas vezes ira usar?");
        Double valorUsado = leitor.nextDouble();
        
        Integer cout = 1 ;
        for (int i = 0; i <= valorUsado; i++) {
           Usuario1.usar();
           
           cout++;
        }
        
        System.out.println("Saldo após o use é de: %.2f" + Usuario1.saldo);
        System.out.println(String.format("Saldo após o use é de: %.2f", Usuario1.saldo));
        
        
    }

    
}
