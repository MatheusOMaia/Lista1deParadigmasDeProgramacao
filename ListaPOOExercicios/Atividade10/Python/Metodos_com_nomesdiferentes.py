class Calculadora:
    def soma2numeros(self, n1, n2):
        return n1 + n2

    def soma3numeros(self, n1, n2, n3):
        return n1 + n2 + n3

calculadora = Calculadora()
n1 = 10
n2 = 20
n3 = 30
print(calculadora.soma2numeros(n1, n2))
print(calculadora.soma3numeros(n1, n2, n3))


