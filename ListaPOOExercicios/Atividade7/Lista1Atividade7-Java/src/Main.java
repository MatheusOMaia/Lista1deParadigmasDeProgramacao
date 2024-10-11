public class Main {
    public static void main(String[] args) {
        Professor joca = new Professor("Joca", 20);
        Professor ulysses = new Professor("Ulysses", 40);
        Professor beto = new Professor("Beto", 55);

        Escola escola1 = new Escola("Escola1", "Centro");
        Escola escola2 = new Escola("Escola2", "Bessa");
        Escola escola3 = new Escola("Escola3", "Torre");

        escola1.contratarProfessor(joca);
        escola2.contratarProfessor(joca);
        escola3.contratarProfessor(joca);
        escola1.contratarProfessor(ulysses);
        escola1.contratarProfessor(beto);

        System.out.println(escola1.mostrarProfessoresContratados());
        System.out.println(joca.mostrarEscolaOndeTrabalha());
    }
}