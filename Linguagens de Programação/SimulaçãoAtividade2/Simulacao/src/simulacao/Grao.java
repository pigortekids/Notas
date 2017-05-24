package simulacao;

public class Grao extends Produto{
    
    private double dimensaoA;
    private double dimensaoC;
    private double dimensaoL;
    private double peso;
    
    public Grao(double v, double dA, double dC, double dL, double peso){
        super(v);
        this.dimensaoA = dA;
        this.dimensaoC = dC;
        this.dimensaoL = dL;
        this.peso = peso;
        
    }
    
    @Override
    public void calcularVolume(){
        this.volume = this.dimensaoA * this.dimensaoC * this.dimensaoL;
    }
    
    
}
