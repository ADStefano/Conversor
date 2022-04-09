
public class Cauda {
    
    private String forma;
    private String tipoPelo;

    public Cauda(String forma, String tipoPelo) {
        
        this.forma = forma;
        this.tipoPelo = tipoPelo;
    }
    public void print() {

        System.out.println("Cauda: "+this.forma+" com "+this.tipoPelo);
        
    }
    
}
