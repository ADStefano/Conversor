

public class Pets {

    protected Dono meuDono;
    protected String nome;
    protected String raca;
    protected int idade;
    protected Cauda minhaCauda;

    public Pets (String nome, String raca, String forma, String tipoPelo, int idade){
        this.nome=nome;
        this.raca=raca;
        this.idade=idade;
        this.minhaCauda= new Cauda(forma,tipoPelo);
    }

    public void setMeuDono(Dono meuDono){
        this.meuDono=meuDono;
    }

    public String getnome(){
        return nome;
    }

    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Raça: "+this.raca);
        System.out.println("Idade: "+this.idade);
        minhaCauda.print();
        System.out.println()    ;
    }

    public void realizarRefeicao(){
        System.out.println(this.nome+" fazendo a sua refeição.");
    }

    public void agradarDono() {
        this.meuDono.receberFesta();
        
    }
    
}
