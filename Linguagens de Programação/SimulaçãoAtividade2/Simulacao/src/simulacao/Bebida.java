package simulacao;

public class Bebida extends Produto{
    
    private double dimensaoA;
    private double dimensaoD;
    private double capacidade;
    
    public Bebida(double v, double dA, double dD, double cap){
        super(v);
        this.dimensaoA = dA;
        this.dimensaoD = dD;
        this.capacidade = cap;
    }
    
    @Override
    public void calcularVolume(){
        this.volume = this.dimensaoA * (3.1416 * (this.dimensaoD/2.0)*(this.dimensaoD/2.0));
    }
    
}
