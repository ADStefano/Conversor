import random

class Cartas:

    __naipes = ("ouros","paus","copas","espadas")
    __cartas = ("1","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei","As")
  
    __baralho = []

    def __init__(self):
        
        self.criarBaralho()
        self.removerCarta()

    def removerCarta(self):

        if len(self.__baralho) == 0:
            print("Acabaram as cartas!!")
        else:
            self.__carta = random.choice(self.__baralho)
            self.__baralho.remove(self.__carta)
            self.__imprimir()

    def criarBaralho(self):
        for carta in range(len(self.__cartas)):
            for naipe in range(len(self.__naipes)):
                self.__baralho.append(self.__cartas[carta] + " de " + self.__naipes[naipe])
        self.__baralho.append("Coringa")
        self.__baralho.append("Coringa")

    def __imprimir(self):

        print(f"Carta: {self.__carta}")

if __name__ == "__main__":

    cartuliscar = Cartas()
    for i in range(58):
        cartuliscar.removerCarta()