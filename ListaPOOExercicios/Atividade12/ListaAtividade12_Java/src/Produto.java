public class Produto {
    public double preco;
    public double descontoaplicado;

    public Produto(double preco, double descontoaplicado){
        this.descontoaplicado = descontoaplicado;
        this.preco = preco;
    }
    public static Double somarProduto(Produto produto, Produto outroproduto){
        double precototal1 = produto.preco - (produto.preco * (produto.descontoaplicado/100));
        double precototal2 = outroproduto.preco - (outroproduto.preco * (outroproduto.descontoaplicado/100));
        return precototal1 + precototal2;
    }
}
