package simulacao;

public class Retangulo extends Pallet{
    
    public double dimensaoC = 140;
    public double dimensaoA = 10;
    public double dimensaoL = 100;
    
    public Retangulo(){
        calcularVolume();
    }
       
    @Override
    public void calcularVolume(){
        this.volume = this.dimensaoA * this.dimensaoC * this.dimensaoL;
    }
    
    public double getComprimento(){
        return this.dimensaoC;
    }
    
    public int quantCabe(double volumeProduto){
        
        return (int)(this.volume / volumeProduto);   
    }
    
}
