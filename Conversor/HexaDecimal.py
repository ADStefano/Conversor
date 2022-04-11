
def NumDecimal(caractere): # Pega o índice dos caracteres
    caracteres = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']

    for i in range(len(caracteres)):
        if caractere == caracteres[i]:
            return i

def HexaDec(NumHexa): # Usa o índice para fazer a conta e transformar em hexadecimal
    NumDec = 0
    contador = 0

    for caractere in range(len(NumHexa),0,-1): # aqui que a magia acontece
        NumDec = NumDec + 16 ** contador * NumDecimal(NumHexa[caractere-1])
        contador += 1
            
    print(str(NumDec)) #imprime

num = input("Insira o hexadecimal que deseja converter para decimal: ") 

HexaDec(num)