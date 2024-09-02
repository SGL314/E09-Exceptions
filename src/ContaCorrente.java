
public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, Cliente dono, double saldo, double limite){
        super(numero,dono,saldo,limite);
        this.setLimite(limite);
    }
    @Override
    public void setLimite(double limite) throws IllegalArgumentException {
        if (limite < -100) throw new IllegalArgumentException();
        this.limite = limite;
    }
    @Override
    public double calculaTaxas(){
        return this.dono.calculaTaxas();
    }
}



