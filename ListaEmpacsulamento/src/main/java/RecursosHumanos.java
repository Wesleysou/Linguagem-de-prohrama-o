
public class RecursosHumanos {

    private Integer totalReajuste;
    private Integer totalPromovidos;

    public RecursosHumanos() {
        this.totalReajuste = 0;
        this.totalPromovidos = 0;
    }

    public void reajustarSalario(Colaborador colab, Double valorReajuste) {

        Double novoSalario = colab.getSalario() + valorReajuste;
        colab.setSalario(novoSalario);

        totalReajuste++;
    }

    public void promoverColaborador(Colaborador colab, String cargo, Double novoSalario) {

        if (colab.getSalario() < novoSalario) {
            colab.setCargo(cargo);
            colab.setSalario(novoSalario);
            totalPromovidos++;
        } else {

            System.out.println("Não promova pagando menos ò_ó");

        }

    }

    public Integer getTotalPromovidos() {
        return totalReajuste;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalReajuste = totalPromovidos;
    }

    public Integer getTotalPromovido() {
        return totalPromovidos;
    }

    public void setTotalPromovido(Integer totalPromovido) {
        this.totalPromovidos = totalPromovido;
    }

}
