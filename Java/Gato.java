

public class Gato extends Pets {

    private String sexo;
    private boolean alimentado;

    public Gato(String nome, String raca, String sexo,String forma, String tipoPelo, int idade,boolean alimentado){
        
        super(nome, raca, forma, tipoPelo, idade);
        this.sexo=sexo;
        this.alimentado = false;
    }

    public void print(){
        
        super.print();
        System.out.println("Sexo: "+this.sexo);
        System.out.println("O gato está alimentado?: "+this.alimentado);
    }
    
    @Override
    public void realizarRefeicao(){
        super.realizarRefeicao();
        System.out.println(this.nome+" fazendo a sua refeição.");
        this.alimentado=true;
    }

    @Override
    public void agradarDono(){
        if (alimentado){
            super.agradarDono();
        }
        else{
            System.out.println("O gato te ignorou.");
        }

    }

    
}
