
public class Dono {

    private String nome;
    private Pets[] pets;// Dono está associado a um vetor pets de caẽs

    public Dono(String nome){
        this.nome=nome;
        pets=new Pets[3];//vetor preparado para receber até 3 caẽs
    }

    public void addPet(int index,Pets pet){//incluiu um objeto de cão no vetor pets

        this.pets[index]=pet;
    }
    
    public Pets getPet(int index){//obtém uma instancia de Cao na posição index do vetor pets
        return this.pets[index];
    }

    public void alimentar(){//invoca realizarRefeicao para cada objeto de pets
        for(int i=0;i<3;i++)
        pets[i].realizarRefeicao();
    }

    public void receberFesta(){//invoca receberFesta para cada objeto de pets

        for(int i=0;i<3;i++)
        System.out.println(this.nome+" está recebendo festa de "+this.pets[i].getnome());
    }

    public void listarCaes(){//lista todos os cães
        for(int i=0;i<3;i++)
        this.getPet(i).print();
    }

    public static void main(String [] args) {

        Dono angelo = new Dono("Ângelo");
        Cao biscoito = new Cao("Biscoito","Golden Retriever","Macho","liso","pêlo longo",3);
        Cao bolacha = new Cao("Bolacha","Vira-lata","Fêmea","Liso","Pêlo curto",2);
        Cao bob = new Cao("Bob","Pincher","Macho","Liso","Pêlo curto",16);
        angelo.addPet(0,biscoito);
        angelo.addPet(1,bolacha);
        angelo.addPet(2,bob);
        biscoito.setMeuDono(angelo);
        bolacha.setMeuDono(angelo);
        bob.setMeuDono(angelo);

        System.out.println("Cãozinhos de "+angelo.nome);
        angelo.listarCaes();

        angelo.alimentar();
        biscoito.agradarDono();


        
    }
}
