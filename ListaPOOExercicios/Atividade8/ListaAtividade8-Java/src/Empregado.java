public class Empregado {
    String nome;
    String cargo;
    double salario;

    public Empregado(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + '\t' + cargo + '\t' + salario+ "R$";
    }
}
