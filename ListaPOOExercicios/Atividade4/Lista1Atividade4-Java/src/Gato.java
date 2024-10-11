public class Gato extends Animal{
    public Gato(String nome, String especie){
        super(nome, especie);
    }

    public void emitirSom() {
        System.out.println("Miau");
    }
}
