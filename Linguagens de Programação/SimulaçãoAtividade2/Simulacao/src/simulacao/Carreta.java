package simulacao;

public class Carreta{
    
    private boolean seguro;
    private double largura;
    private double comprimento;
    private static double altura = 250;
    
    public Carreta(boolean seguro, double lar, double comp){
        this.seguro = seguro;
        this.largura = lar*100;
        this.comprimento = comp*100;
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public boolean temSeguro(){
        return this.seguro;
    }
    
    public int quantosCabe(){
        
        Retangulo pR = new Retangulo();
        Quadrado pQ = new Quadrado();
        int quantL = (int)(this.largura / pQ.dimensaoC);
        int quantC = (int)(this.comprimento / pQ.dimensaoL);
        int p = -1;
        
        for(int i=0 ; i<quantL ; i++){
            if( ((pQ.getComprimento() * i) + (pR.getComprimento() * (quantL-i-2))) % this.largura == 0 ){
                p = i;
            }
        }
        if(p != -1){
            return p * quantC;
        }
        else{
            return 0;
        }
    }
}
