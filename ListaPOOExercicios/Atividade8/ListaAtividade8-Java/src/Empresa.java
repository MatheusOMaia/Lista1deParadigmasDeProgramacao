import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nome;
    String endereco;
    List<Empregado> empregadoscontratados = new ArrayList<>();

    public Empresa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public void contratarFuncionario(Empregado empregado, double salario, String cargo){
        empregadoscontratados.add(empregado);
        empregado.cargo = cargo;
        empregado.salario = salario;
    }
    public void mostrarFuncionariosEmpresa(){
        System.out.println("Lista de funcionários da empresa: ");
        for(Empregado empregado: empregadoscontratados){
            System.out.println(empregado);
        }
    }
}
