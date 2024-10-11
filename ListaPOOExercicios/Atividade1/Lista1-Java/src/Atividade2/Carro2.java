package Atividade2;
public class Carro2 {
    private String marca;
    private String modelo;
    private String ano;
    private double velocidade;



    public Carro2(String marca, String modelo, String ano, double velocidade){
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
    public void desacelerar(double desaceleracao){
        velocidade -= desaceleracao;
    }

}