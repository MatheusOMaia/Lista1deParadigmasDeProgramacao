class Escola:
    def __init__(self, nome, endereco):
        self.nome = nome
        self.endereco = endereco
        self.professores = []

    def contratarprofessor(self, professor):
        self.professores.append(professor)
        professor.escolasondetrabalha.append(self)

    def mostrarprofessores(self):
        print(f"Professores da escola {self.nome}: ")
        for professor in self.professores:
            print(professor.nome)


class Professor:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.escolasondetrabalha = []

    #def sercontratado(self, escola):
        #self.escolasondetrabalha.append(escola)
        #escola.contratarprofessor(self)

    def mostrarescolasondetrabalha(self):
        print(f"Escolas onde {self.nome} trabalha:")
        for escola in self.escolasondetrabalha:
            print(f"{escola.nome}")


joca = Professor("Joca", 20)
beto = Professor("Beto", 55)
ulysses = Professor("Ulysses", 40)

escola1 = Escola("Escola1", "Centro")
escola2 = Escola("Escola2", "Bessa")
escola3 = Escola("Escola3", "Torre")

escola1.contratarprofessor(joca)
escola1.contratarprofessor(beto)
escola1.contratarprofessor(ulysses)
escola2.contratarprofessor(joca)
escola3.contratarprofessor(joca)

escola1.mostrarprofessores()
joca.mostrarescolasondetrabalha()

