from typing import Protocol


class Imprimivel(Protocol):
    def imprimir(self):
        pass

class Relatorio:
    def imprimir(self):
        print("Relatório impresso")


class Contrato:
    pass
    #def imprimir(self):
        # print("Contrato impresso")


def imprimir_imprimivel(imprimivel : Imprimivel):
    imprimivel.imprimir()


relatorio: Imprimivel = Relatorio()
contrato: Imprimivel = Contrato()   # Como contrato não possui o método imprimir, ele não segue o protocolo Imprimivel

imprimir_imprimivel(relatorio)
#imprimir_imprimivel(contrato) Exceção

