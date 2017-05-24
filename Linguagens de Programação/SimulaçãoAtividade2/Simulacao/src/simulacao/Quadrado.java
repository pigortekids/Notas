package simulacao;

public class Quadrado extends Pallet{
    
    public double dimensaoC = 100;
    public double dimensaoA = 10;
    public double dimensaoL = 100;
    
    public Quadrado(){
        calcularVolume();
    }
    
    @Override
    public void calcularVolume(){
        this.volume = this.dimensaoA * this.dimensaoC * this.dimensaoL;
    }
    
    public boolean cabe(double volumeProduto, int quantProduto){
        
        boolean cabe = true;
        
        if(this.volume < (volumeProduto * quantProduto)){
            cabe = false;
        }
        return cabe;   
    }
    
}
