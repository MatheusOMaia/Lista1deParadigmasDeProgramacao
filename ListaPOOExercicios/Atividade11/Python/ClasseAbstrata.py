from abc import ABC, abstractmethod


class Funcionario(ABC):
    @abstractmethod
    def calcularSalario(self):
        pass


class FuncionarioHorista(Funcionario):
    def __init__(self, horastrabalhadas, valorhora):
        self.horastrabalhadas = horastrabalhadas
        self.valorhora = valorhora

    def calcularSalario(self):
        salario = self.valorhora * self.horastrabalhadas
        return f"O Valor total do salário do horista é:{salario}"


class FuncionarioAssalariado(Funcionario):
    def __init__(self, salariobruto, descontos):
        self.salariobruto = salariobruto
        self.descontos =descontos

    def calcularSalario(self):
        salarioliquido = self.salariobruto - self.descontos
        return f"Valor do salário líquido do assalariado é: {salarioliquido}"


funcionario_horista1 = FuncionarioHorista(300, 5)
print(funcionario_horista1.calcularSalario())
funcionario_assalariado = FuncionarioAssalariado(2000, 300)
print(funcionario_assalariado.calcularSalario())
