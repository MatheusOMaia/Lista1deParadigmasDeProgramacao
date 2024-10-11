public class Carro {
    public String marca;
    public String modelo;
    public String ano;
    public double velocidade;

    public Carro(String marca, String modelo, String ano, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void detalhesCarro(){
        System.out.println("Marca: "+marca+
                        ", Modelo: "+modelo+
                        ", Ano: "+ano+
                        ", Velocidade: "+velocidade+"KM/h");
    }
    // Acelerar e Frear
    public void acelerar(double aceleracao){
        velocidade += aceleracao;
    }
    public void frear(double aceleracao){
        velocidade -= aceleracao;
    }


}
