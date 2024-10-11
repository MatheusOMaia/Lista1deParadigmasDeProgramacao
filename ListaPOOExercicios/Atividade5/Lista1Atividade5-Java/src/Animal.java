public class Animal {
    public String nome;
    public String especie;

    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public String emitirSom(){
        return "Esse animal faz";
    }
}
