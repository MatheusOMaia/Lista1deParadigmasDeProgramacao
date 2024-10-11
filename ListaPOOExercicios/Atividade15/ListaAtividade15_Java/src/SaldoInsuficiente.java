public class SaldoInsuficiente extends RuntimeException{
    public SaldoInsuficiente(){
        super("Não há saldo o suficiente");
    }
}
