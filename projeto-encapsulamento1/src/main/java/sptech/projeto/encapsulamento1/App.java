
package sptech.projeto.encapsulamento1;

public class App {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        /*aluno1.ra = "#123";
        aluno1.nome = "Huk";
        aluno1.curso = "ADS";
        aluno1.nota1 = 10.0;
        aluno1.nota2 = 8.0;*/
        
        aluno1.setRa("#123");
        aluno1.setNome("Huk");
        aluno1.setCurso("ADS");
        aluno1.setNota1(10.0);
        aluno1.setNota2(8.0);
        
        System.out.println(aluno1);
        /*System.out.println(String.format("RA: %s", aluno1.getRa()));
        System.out.println(String.format("NOME: %s", aluno1.getNome()));
        System.out.println(String.format("CURSO: %s", aluno1.getCurso()));
        System.out.println(String.format("NOTA 1: %.1f", aluno1.getNota1()));
        System.out.println(String.format("NOTA 2: %.1f", aluno1.getNota2()));
        System.out.println(String.format("Média: %.1f", aluno1.getMedia()));*/
        
    }
}
