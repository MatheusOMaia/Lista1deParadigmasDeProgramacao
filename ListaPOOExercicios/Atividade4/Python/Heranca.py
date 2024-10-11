class Animal():
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome

    def emitir_som(self):
        pass

class Cachorro(Animal):
    def emitir_som(self):
        return "Au Au"

class Gato(Animal):
    def emitir_som(self):
        return "Miau"

bob = Cachorro("cachorro", "Bob")
pretinho = Gato("Gato", "Pretinho")

print(bob.emitir_som())
print(pretinho.emitir_som())