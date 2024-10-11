class Matematica:
    @staticmethod
    def fatorial(numero: int):
        if numero == 0:
            return 1
        for i in range(numero, 1, -1):
            numero = numero * (i-1)
        return numero



numero = 8
print(Matematica.fatorial(numero))

