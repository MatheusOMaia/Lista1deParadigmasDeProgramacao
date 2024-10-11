public class Cachorro extends Animal{
    public Cachorro(String nome, String especie){
        super(nome, especie);
    }

    public void emitirSom() {
        System.out.println("Au Au");
    }
}
