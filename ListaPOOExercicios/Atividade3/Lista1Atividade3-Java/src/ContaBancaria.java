public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double adepositar){
        this.saldo += adepositar;
    }
    public void sacar(double asacar){
        this.saldo -= asacar;
    }

    public void mostrarSaldo(){
        System.out.println("O seu Saldo é de "+saldo+"R$");
    }


}

