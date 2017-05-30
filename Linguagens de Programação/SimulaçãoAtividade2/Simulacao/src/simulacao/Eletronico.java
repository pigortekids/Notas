package simulacao;

public class Eletronico extends Produto{
    
    private double dimensaoC;
    private double dimensaoE;
    private double dimensaoL;
    
    public Eletronico(double v, double dC, double dE, double dL){
        super(v);
        this.dimensaoC = dC;
        this.dimensaoE = dE;
        this.dimensaoL = dL;
    }
    
    
    @Override
    public void calcularVolume(){
        this.volume = this.dimensaoE * this.dimensaoC * this.dimensaoL;
    }
    
}
