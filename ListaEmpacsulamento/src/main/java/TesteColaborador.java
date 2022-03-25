public class TesteColaborador {
    
    public static void main(String[] args) {
        
        Colaborador colab1 = new Colaborador("Wesley", "Dev back-end", 10000.00);
        Colaborador colab2 = new Colaborador("Giuliana", "Dev back-end");
        
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.promoverColaborador(colab1,"Dev Senior", 100000.00);
        
        rh.reajustarSalario(colab2, 20000.00);
        
        
//        // Colaborador 01
//        System.out.println(colab1.getNome());
//        System.out.println(colab1.getCargo());
//        System.out.println(colab1.getSalario());
//    
//        // Colaborador 02
//        System.out.println(colab2.getNome());
//        System.out.println(colab2.getCargo());
//        System.out.println(colab2.getSalario());


}
    
}
