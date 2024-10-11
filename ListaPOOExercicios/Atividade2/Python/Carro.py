class Carro:
    def __init__(self, marca, modelo, ano, velocidade):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = velocidade

    def detalhes_carro(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}, Velocidade: {self.velocidade} KM/h")

    def acelerar(self, aceleracao):
        self.velocidade += aceleracao

    def frear(self, desaceleracao):
        self.velocidade -= desaceleracao


carro1 = Carro("Fiat", "Uno", "2020", 0)
carro2 = Carro("Volkswagen", "Gol", "2019", 0)
carro3 = Carro("Chevrolet", "Camaro", "2015", 0)
carro1.acelerar(10)
carro2.acelerar(21)
carro3.acelerar(30)
carro2.frear(10)
carro1.detalhes_carro()
carro2.detalhes_carro()
carro3.detalhes_carro()
