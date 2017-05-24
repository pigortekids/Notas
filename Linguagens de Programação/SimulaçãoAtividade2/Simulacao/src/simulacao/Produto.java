package simulacao;

public abstract class Produto implements IVolume{
    
    protected double valor;
    protected double volume;
    
    public Produto(double v){
        this.valor = v;
    }
    
    @Override
    public abstract void calcularVolume();
    
}
