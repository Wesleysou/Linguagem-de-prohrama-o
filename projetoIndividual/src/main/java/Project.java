
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

public class Project {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
            
            System.out.println("-----------------------");
            System.out.println("------ Bem-VIndo ------");
            System.out.println("-----------------------");
            System.out.println("* * * * * * * * * * * *");
            System.out.println(" * * * * * * * * * * * ");
            System.out.println("Escolha uma das opções");
            System.out.println("(1) - Calculo de água");
            System.out.println("(2) - Biotipo");
            System.out.println("(3) - IMC");
            System.out.println("(4) - Sair");
            Integer escolhaUser = leitor.nextInt();
            
            
         switch (escolhaUser) {
             case 1:
                 System.out.println("Já Parou para pensar quanto de água seu"
                         +"compo necessita? \n que tal fazer o calculo gora mesmo");
                 
                 System.out.println("++++++++++++++++++++++++++++++++++++++");
                 
                 System.out.println("Digite o seu peso");
                 Integer pesoUser = leitor.nextInt();
                 
                 Integer aguaCorpo = pesoUser * 035; 
                 
                 System.out.println(String.format("Você precisa beber %dmls de água"
                         + "", aguaCorpo));
                 
                 break;
             case 2:
                 System.out.println("Carregando.................");
                 System.out.println("                                ");
                 System.out.println("Bora descobrir seu tipo corporal?");
                 System.out.println("* * * * * * * * * * * * * * * * *");
                 System.out.println("Qual dessas descrições se encaixa com você?");
                 System.out.println(" * * * * * * * * * * * * * * * * ");
                 System.out.println("(1) - Você tem ombros largos e facilidade "
                         + "em ganho de massa?");
                 System.out.println("(2) - Você tem ombros finos e dificuldade "
                         + "em ganho de massa?");
                 System.out.println("(3) - Você tem ombros largos, facilidade "
                         + "em ganho de massa e perca de massa?");
                 Integer tipoCorporal = leitor.nextInt();
                 
                 switch (tipoCorporal) {
                     case 1:
                         System.out.println("Você tem características de um"
                                 + " ECTOMORFO");
                         break;
                     case 2:
                          System.out.println("Você tem características de um"
                                  + " ENDOMORFO");
                         break;
                     case 3:
                         System.out.println("Você tem Características de um"
                                 + " MESOMORFO");
                         break;
                     default:
                         System.out.println("Valor invalido digite novamente");
                         tipoCorporal = leitor.nextInt();
                        break;
                 }
                 
                 break;
             case 3:
                  
                 System.out.println("Carregando......");
                 System.out.println("* * * * * * * * * * * * * ");
                 
                 System.out.println("Digite seu peso: ");
                 Integer pesoUserImc = leitor.nextInt();
                 
                 System.err.println("Digite sua altura:");
                 Double alturaUserImc = leitor.nextDouble();
                 
                 Double Imc = pesoUserImc / (alturaUserImc * alturaUserImc);
                 
                 System.out.println(String.format("Sue imc é %.2f",Imc));
                
                 break;
             case 4:
           
                 break;
             default:
                 System.out.println("número invalido digite novamente");
                 escolhaUser = leitor.nextInt();
                 break;
         }
              
}          
}
