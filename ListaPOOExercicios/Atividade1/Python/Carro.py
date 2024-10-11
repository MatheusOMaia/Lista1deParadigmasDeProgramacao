class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def detalhes_carro(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")


carro1 = Carro("Fiat", "Uno", "2020")
carro2 = Carro("Volkswagen", "Gol", "2019")
carro3 = Carro("Chevrolet", "Camaro", "2015")
carro1.detalhes_carro()
carro2.detalhes_carro()
carro3.detalhes_carro()
