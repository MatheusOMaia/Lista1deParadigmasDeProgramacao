public class Configuracao {
    private static Configuracao configuracao;
    private boolean config1, config2, config3;

    private Configuracao(){
        this.config1 = false;
        this.config2 = false;
        this.config3 = false;
    }

    public static Configuracao instanciar(){
        if (configuracao == null)
            configuracao = new Configuracao();
        return configuracao;
    }

}
