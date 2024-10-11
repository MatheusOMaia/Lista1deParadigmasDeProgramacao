class Empresa:
    def __init__(self,nome,endereco):
        self.nome = nome
        self.endereco = endereco
        self.funcionarios = []

    def contratarfuncionarios(self, empresario):
        self.funcionarios.append(empresario)

    def mostrarfuncionarios(self):
        print(f"Lista de funcionarios da empresa {self.nome}:")
        for empresario in self.funcionarios:
            print(f"{empresario.detalhes_empresario()}")


class Empresario:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def detalhes_empresario(self):
        return f"Nome: {self.nome}, Cargo: {self.cargo}, Salario: {self.salario}"


empresa1 = Empresa("empresa1", "bairro")
ricardo = Empresario("Ricardo", "Cargo2", 5000)
lorena = Empresario("Lorena", "Cargo1", 10000)

empresa1.contratarfuncionarios(ricardo)
empresa1.contratarfuncionarios(lorena)
empresa1.mostrarfuncionarios()
