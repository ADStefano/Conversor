

public class ReceitaFederal {
    public static void main(String [] args){
        Contribuinte Yago = new Contribuinte("Yago");
        Dependente Jamal = new Dependente("Jamal");
        Dependente Hakin = new Dependente("Hakin");

        Yago.ligarDependente(Jamal);
        Yago.ligarDependente(Hakin);
        Yago.imprimir();
        System.out.println("Número de dependentes: "+Yago.numeroDependentes()+"\n");

        Contribuinte Henrique = new Contribuinte("Henrique");
        Henrique.imprimir();
        System.out.println("Número de dependentes: "+Henrique.numeroDependentes()+"\n");

        Contribuinte Joao = new Contribuinte("João");
        Dependente Ana = new Dependente("Ana");

        Joao.ligarDependente(Ana);
        Joao.imprimir();
        System.out.println("Número de dependentes: "+Joao.numeroDependentes()+"\n");
    }
    
}
