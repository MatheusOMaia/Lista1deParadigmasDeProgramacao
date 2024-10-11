public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Empresa1", "Endereco1");
        Empregado ricardo = new Empregado("Ricardo");
        Empregado lorena = new Empregado("Lorena");

        empresa1.contratarFuncionario(ricardo, 2000, "Cargo1");
        empresa1.contratarFuncionario(lorena, 3000, "Cargo2");

        empresa1.mostrarFuncionariosEmpresa();


    }
}