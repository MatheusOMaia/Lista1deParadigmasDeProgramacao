public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(100, 80);
        Produto produto2 = new Produto(500, 0);
        System.out.println(Produto.somarProduto(produto1, produto2));
    }
}