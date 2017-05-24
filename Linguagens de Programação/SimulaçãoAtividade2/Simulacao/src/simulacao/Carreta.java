package simulacao;

public class Carreta implements IVolume{
    
    private boolean seguro;
    private double volume;
    private double largura;
    private double comprimento;
    private static double altura = 250;
    
    public Carreta(boolean seguro, double lar, double comp){
        this.seguro = seguro;
        this.largura = lar*100;
        this.comprimento = comp*100;
    }
    
    @Override
    public void calcularVolume(){
        this.volume = this.comprimento * this.largura * Carreta.altura;
    }
    
    public boolean temSeguro(){
        return this.seguro;
    }
    
    public boolean cabe(double volumePallet, int quantPallet){
        
        boolean cabe = true;
        
        if(this.volume < (volumePallet * quantPallet)){
            cabe = false;
        }
        return cabe;   
    }
}
