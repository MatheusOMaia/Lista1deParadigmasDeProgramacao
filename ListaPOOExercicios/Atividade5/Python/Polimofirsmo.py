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


dinho = Cachorro("cachorro", "Dinho")
bob = Cachorro("cachorro", "Bob")
pretinho = Gato("Gato", "Pretinho")
animais = [dinho, pretinho, bob]

def sons_animais(animais):
    for Animal in animais:
        print(Animal.nome + " faz", Animal.emitir_som())

sons_animais(animais)




