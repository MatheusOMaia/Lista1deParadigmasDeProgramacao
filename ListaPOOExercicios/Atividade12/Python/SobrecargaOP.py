class Produto:
    def __init__(self, preco, descontoaplicado):
        self.preco = preco
        self.descontoaplicado =descontoaplicado

    def __add__(self, other):
        precototal1 = self.preco - (self.preco * (self.descontoaplicado/100))
        precototal2 = other.preco - (other.preco * (other.descontoaplicado/100))
        return precototal1 + precototal2

produto1 = Produto(100,80)
produto2 = Produto(500,0)
print(produto1 + produto2)