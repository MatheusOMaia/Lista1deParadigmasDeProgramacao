import java.util.ArrayList;
import java.util.List;

public class Escola {
    public String nome;
    public String endereco;
    public List<Professor> professorescontratados = new ArrayList<>();

    public Escola(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public void contratarProfessor(Professor professor){
        professorescontratados.add(professor);
        professor.escolasondetrabalha.add(this);
    }
    public String mostrarProfessoresContratados(){
        String listadeprofessores = "Professores Contratados em "+nome+": ";
        for(Professor professor : professorescontratados){
            listadeprofessores = listadeprofessores +"\n"+professor.nome;
        }
        return listadeprofessores;
    }
}
