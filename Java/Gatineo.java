public class Gatineo extends Mamifero {

    //private static final long serialVersionsUID = 1L;

    public Gatineo(String nome, int idade, String dono){
        super(nome, idade, dono);
    }

    @Override
    public String soar(){
        return "Mia gatíneo mia, miauu miauu";
    }
    
}
