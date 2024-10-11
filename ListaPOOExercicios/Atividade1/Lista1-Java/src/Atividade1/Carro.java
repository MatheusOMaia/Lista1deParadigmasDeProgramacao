package Atividade1;
public class Carro {
    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void detalhesCarro(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+", Ano: "+ano);

    }

}
