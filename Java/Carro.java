
public class Carro {

    private String marca;// atributo oculto, encápsulamento
    private boolean ligado;//atributo oculto,encápsulamento

    public Carro(String marca, boolean ligado){// método construtor
        this.marca=marca;
        this.ligado=ligado;
    }

    public String getMarca(){//retorna o valor do atributo privado
        return marca;
    }

    public void setMarca(String marca){//altera o valor de "marca"
        this.marca=marca;
    }

    public boolean isLigado(){//retorna o valor do atributo privado
        return ligado;
    }
    
    public void setLigado(boolean ligado){//altera o valor de "ligado"
        this.ligado=ligado;
    }

    public void imprimir(){// método print que exibe o valor na tabela
        System.out.println("Marca do carro: "+marca);
    }
    
    
    public static void main(String[]args){//o programa roda a partir daqui
        Carro meuCarro = new Carro("Ford Fiesta",false);//instancia o carro
        meuCarro.imprimir();// método publico paraexibir dados privador/encápsulados
        System.out.println("Marca do carro: "+meuCarro.getMarca());
        System.out.println("Está ligado?: "+(meuCarro.isLigado()==true?"Ligado":"Desligado"));
        meuCarro.setMarca("Renautl");
        meuCarro.setLigado(true);
        System.out.println("Marca do carro: "+meuCarro.getMarca());
        System.out.println("Está ligado?: "+(meuCarro.isLigado()==true?"Ligado":"Desligado"));
    }
}
