import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String nome;
    public int idade;
    public List <Escola> escolasondetrabalha = new ArrayList<>();

    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String mostrarEscolaOndeTrabalha(){
        StringBuilder sblistaprofessor = new StringBuilder("Escolas onde "+nome+" trabalha: ");
        for(Escola escola : escolasondetrabalha){
            sblistaprofessor.append("\n"+escola.nome);
        }
        return sblistaprofessor.toString();
    }
}
