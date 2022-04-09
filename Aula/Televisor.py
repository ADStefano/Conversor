class Televisor:

    def __init__(self):
        self.__canal = 1
        self.__volume = 0

    def aumentarVolume(self):
        volume = self.__volume + 1
        self.__volume = volume if volume <= 10 else 10
        self.__imprimir()

    def diminuirVolume(self):
        volume = self.__volume - 1
        self.__volume = volume if volume >= 0 else 0
        self.__imprimir()
    
    def trocarCanal(self,canal):
        if 1 <= canal <= 15:
            self.__canal = canal
        else:
            self.__canal = 1
        
        self.__imprimir()

    def trocarVolume(self,volume):
        if 0 <= volume <= 10:
            self.__volume = volume
        else:
            self.__volume = 1
        
        self.__imprimir()

    def __imprimir(self):
        print(f"Televisor\n Canal: {self.__canal}\n Volume: {self.__volume}")

if __name__ == "__main__":

    televisao = Televisor()
    televisao.trocarCanal(5)
    televisao.trocarVolume(4)
    televisao.aumentarVolume()