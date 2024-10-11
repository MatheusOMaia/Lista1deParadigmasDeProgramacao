public class FuncionarioHorista extends Funcionario{
    public double horastrabalhadas;
    public double valorhora;

    public FuncionarioHorista(double horastrabalhadas, double valorhora){
        this.valorhora = valorhora;
        this.horastrabalhadas = horastrabalhadas;
    }
    @Override
    public double calcularsalario() {
        return this.horastrabalhadas * this.valorhora;
    }

}
