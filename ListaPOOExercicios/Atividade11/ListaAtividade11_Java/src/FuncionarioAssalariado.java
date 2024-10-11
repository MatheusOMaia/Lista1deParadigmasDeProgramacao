public class FuncionarioAssalariado extends Funcionario{
    public double salariobruto;
    public double desconto;

    public FuncionarioAssalariado(double salariobruto, double desconto){
        this.desconto = desconto;
        this.salariobruto = salariobruto;
    }
    @Override
    public double calcularsalario() {
        return this.salariobruto - this.desconto;
    }

}
