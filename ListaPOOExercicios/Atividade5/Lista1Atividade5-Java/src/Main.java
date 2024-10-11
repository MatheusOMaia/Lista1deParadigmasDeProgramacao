import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void sons_animais(List<Animal> lista_animais){
        for(Animal animal: lista_animais){
            System.out.println(animal.nome+" faz "+animal.emitirSom());
        }
    }

    public static void main(String[] args) {
        Cachorro bob = new Cachorro("Bob", "Cachorro");
        Gato pretinho = new Gato("Pretinho", "Gato");
        Cachorro dinho = new Cachorro("Dinho", "Cachorro");

        List<Animal> lista_animais = new ArrayList<>();
        lista_animais.add(bob);
        lista_animais.add(pretinho);
        lista_animais.add(dinho);

        sons_animais(lista_animais);
    }
}