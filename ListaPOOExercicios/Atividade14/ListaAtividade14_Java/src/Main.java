public class Main {
    public static void main(String[] args) {
        Configuracao configset1 = Configuracao.instanciar();
        Configuracao configset2 = Configuracao.instanciar();

        System.out.println(configset1 == configset2); //Compara se é os dois referenciam o mesmo objeto
        }
    }
