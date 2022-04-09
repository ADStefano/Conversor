
public class Cao extends Pets{
    
    private String sexo;

    public Cao(String nome, String raca, String sexo, String forma, String tipoPelo,int idade){
        
        super(nome, raca, forma, tipoPelo, idade);
        this.sexo = sexo;

    }
   
    @Override
    public void print(){
        super.print();
        System.out.println("Sexo: "+this.sexo);
        System.out.println("")    ;
    }
}
