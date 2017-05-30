package simulacao;

public abstract class Produto implements IVolume{
    
    protected double valor;
    protected double volume;
    
    public Produto(double v){
        this.valor = v;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    @Override
    public abstract void calcularVolume();
    
}
