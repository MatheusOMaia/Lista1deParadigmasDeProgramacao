class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            print("Criando instância.")
            cls._instancia = super().__new__(cls)
        return cls._instancia

    def __init__(self):
        self._config1 = False
        self._config2 = False
        self._config3 = False

    def set_config1(self, config1):
        self._config1 = config1

    def set_config2(self, config2):
        self._config2 = config2

    def set_config3(self, config3):
        self._config3 = config3

    def print_all_config(self):
        print(f"Configuração 1: {self._config1} \nConfiguração 2: {self._config2} \nConfiguração 3: {self._config3}")


configset1 = Configuracao()
configset2 = Configuracao()
print(configset1 is configset2)



