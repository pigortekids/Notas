package simulacao;

public abstract class Pallet implements IVolume{
    
    protected double volume;
    
    @Override
    public abstract void calcularVolume();
    
}
