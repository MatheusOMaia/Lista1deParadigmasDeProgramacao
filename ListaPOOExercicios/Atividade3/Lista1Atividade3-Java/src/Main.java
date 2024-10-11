public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000, "José");
        //conta1.saldo = 10;    Como saldo tem acesso private, ele não pode ser alterado facilmente
        conta1.mostrarSaldo();
        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta1.sacar(2000);
        conta1.mostrarSaldo();
    }
}