class DecimalBinario: # Provavelmente não era necessário usar uma classe pra isso

  def __init__(self,numero):
      numero = numero

  def ConversorBinario(self,numero):

    binario = []

    while numero != 0:
      if numero % 2 == 0:
        numero = numero/2
        binario.append(0)

      else:
        numero = (numero-1)/2
        binario.append(1)
    
    binario.reverse()

    return print(binario)

if __name__ == "__main__":

  num = int(input("Insira o número que deseja transformar em binário: "))
  decBin = DecimalBinario(num)
  decBin.ConversorBinario(num)
