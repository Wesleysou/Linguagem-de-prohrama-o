package com.mycompany.projeto.poo01;
public class Bilhete {
     String titular;
     Double saldo = 0.0;
    
     
     void carregar(Double valorCarga){
        saldo += valorCarga;
     }
     
     void usar(){
       saldo -= 4.40;
     }
    
}
