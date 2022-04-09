

class Conta {

    private String nome;
    private double saldo;

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public static void main(String[] args){

        Conta conta1 = new Conta();
        conta1.setNome("José");
        conta1.setSaldo(1400);
        System.out.println("Nome da conta: "+conta1.getNome());
        System.out.println("Saldo da conta: "+conta1.getSaldo());
        Conta conta2 = new Conta();
        conta2.setNome("João");
        conta2.setSaldo(6000);
        System.out.println("Nome da conta: "+conta2.getNome());
        System.out.println("Saldo da conta: "+conta2.getSaldo());
    }
}
