package com.mycompany.projeto.poo01;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        conta1.titular = "Hulk";
        
        conta1.saldo = 0.0;
        
        System.out.println("Digite o valor de deposito");
        Integer valorDeposito = leitor.nextInt();
        
        
        System.out.println("Digite o valor de saque");
        Integer valorSacar = leitor.nextInt();
        
        conta1.depositar(valorDeposito);
        conta1.depositar(valorDeposito);
        conta1.depositar(30);
        conta1.depositar(30);
        conta1.depositar(30);
        conta1.depositar(30);
        
        conta1.sacar(valorSacar);
        conta1.sacar(10);
        
        System.out.println(conta1.titular);
        System.out.println(conta1.saldo);
        
        
    }
}