class Contabancaria:
    def __init__(self, saldo, titular):
        self.__saldo = saldo
        self.__titular = titular

    def sacar(self,dinheiroasacar):
        self.__saldo -= dinheiroasacar

    def depositar(self, dinheiroadepositar):
        self.__saldo += dinheiroadepositar

    def mostrarSaldo(self):
        print(f"Seu saldo é de: {self.__saldo} Reais")


cb = Contabancaria(100, "Eu")
print(cb._Contabancaria__saldo)     # Em python não há uma forma concreta de encapsulamento,
cb.mostrarSaldo()                   # as formas de proteger um atributo são por meio de convenções.
cb.sacar(100)
cb.mostrarSaldo()
cb.depositar(1000)
cb._Contabancaria__saldo += 50     # Forma errada de interagir com o saldo, segundo convenção
cb.mostrarSaldo()




