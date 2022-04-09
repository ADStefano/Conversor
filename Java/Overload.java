

public class Overload {

    //Overloaded(sobrecarga) de somar().Esta soma tem 2 parâmetros.
    //retorno int

    public int somar(int x, int y){
        return (x+y);
    }
    
    //Overloaded(sobrecarga) de somar().Esta soma tem 3 parâmetros.
    //retorno int

    public int somar(int x, int y, int z){
        return (x+y+z);
    }

    //Overloaded(sobrecarga) de somar().Esta soma tem 2 parâmetros.
    //retorno double

    public double somar(double x, double y){
        return(x+y);
    }

    public static void main(String []args){

        Overload s = new Overload();
        System.out.println(s.somar(3,4));
        System.out.println(s.somar(3,4,5));
        System.out.println(s.somar(3.4,4.5));
    }
}
