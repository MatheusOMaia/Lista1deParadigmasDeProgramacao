class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

    def detalhes_motor(self):
        return f"Tipo: {self.tipo}, Potência: {self.potencia}"


class Carro:
    def __init__(self, marca, modelo, ano, velocidade, motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = velocidade
        self.motor = motor

    def detalhes_carro(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}, Velocidade: {self.velocidade} KM/h, \nMotor do carro:\n{self.motor.detalhes_motor()}")

    def acelerar(self, aceleracao):
        self.velocidade += aceleracao

    def frear(self, desaceleracao):
        self.velocidade -= desaceleracao


motor1 = Motor("Hibrido", "300")
carro1 = Carro("Fiat", "Uno", "2020", 0, motor1)
carro1.detalhes_carro()




