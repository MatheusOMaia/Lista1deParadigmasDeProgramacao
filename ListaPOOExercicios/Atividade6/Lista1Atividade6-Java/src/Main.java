public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Híbrido", "300");
        Carro carro = new Carro("Fiat", "Uno", 2020, 0, motor);
        System.out.println(carro);
    }
}