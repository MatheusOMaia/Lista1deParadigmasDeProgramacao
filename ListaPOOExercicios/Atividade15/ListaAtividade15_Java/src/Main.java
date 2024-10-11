public class Main {
    public static void main(String[] args) {
       ContaBancaria cb = new ContaBancaria(10000, "Eu");
       cb.mostrarSaldo();
       cb.sacar(100000);


    }
}