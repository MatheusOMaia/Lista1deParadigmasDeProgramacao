public class Motor {
    public String tipo;
    public String potencia;

    public Motor(String tipo, String potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String toString(){
        return "Tipo: "+ tipo + ", Potência: "+ potencia;
    }
}
