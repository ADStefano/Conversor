
import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {	
       System.out.println("Olá Mundo"); 
    }
 }
//Classe para utilizar inputs
// utilizar o import java.util.Scanner;
 class Main{
    public static void main(String[] args){
       // aqui se cria a classe para utilizar o input
       Scanner nome = new Scanner(System.in);
       String nomeUsuario;
       // como regra geral é importante fechar tudo o que você abriu utilizando o método .close()
       nome.close();

       // aqui é o input de fato
       System.out.println("Insira o seu nome: ");
       nomeUsuario = nome.nextLine();
       // print do resultado do input
       System.out.println("O seu nome de usuário é :"+nomeUsuario);
    }
 }