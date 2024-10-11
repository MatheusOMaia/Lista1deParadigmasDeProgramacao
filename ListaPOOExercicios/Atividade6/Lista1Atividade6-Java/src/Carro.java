public class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidade;
    Motor motor;

    public Carro(String marca, String modelo, int ano,double velocidade,Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    public void acelerarCarro(double aceleracao){
        velocidade += aceleracao;
    }
    public void frearCarro(double aceleracao){
        velocidade -= aceleracao;
    }

    @Override
    public String toString() {
        return "Marca: "+marca+
                ", Modelo: "+modelo+
                ", Ano: "+ano+
                ", Velocidade: "+velocidade+"KM/h"+
                ", Motor: "+motor;
    }
}
