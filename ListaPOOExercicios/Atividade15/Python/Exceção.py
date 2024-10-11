class SaldoInsuficiente(Exception):
    "É chamado quando não há saldo suficiente"
    pass

class ContaBancaria:
    def __init__(self, saldo, titular):
        self.__saldo = saldo
        self.__titular = titular

    def sacar(self,dinheiroasacar):
        # try:
        if dinheiroasacar > self.__saldo:
            raise SaldoInsuficiente
        # except SaldoInsuficiente:
            #print(f"Saldo indisponível.\nVocê tentou sacar {dinheiroasacar}R$, de uma conta com {self.__saldo}R$ de Saldo")
        # else:
        else:
            self.__saldo -= dinheiroasacar
            print(f"Saque de {dinheiroasacar}R$ realizado, o Saldo total é {self.__saldo}")

    def depositar(self, dinheiroadepositar):
        self.__saldo += dinheiroadepositar

    def mostrarSaldo(self):
        print(f"Seu saldo é de: {self.__saldo} Reais")


cb = ContaBancaria(10000, "Eu")
cb.mostrarSaldo()
cb.sacar(10000)
cb.mostrarSaldo()
cb.sacar(1000)
cb.mostrarSaldo()




