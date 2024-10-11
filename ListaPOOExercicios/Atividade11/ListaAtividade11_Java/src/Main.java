public class Main {
    public static void main(String[] args) {
        Funcionario funcionariohorista = new FuncionarioHorista(300, 5);
        Funcionario funcionarioassalariado = new FuncionarioAssalariado(2000, 300);

        System.out.println("O Salário do funcionario assalariado é: "+funcionarioassalariado.calcularsalario());
        System.out.println("O Salário do funcionario horista é: "+funcionariohorista.calcularsalario());
    }
}