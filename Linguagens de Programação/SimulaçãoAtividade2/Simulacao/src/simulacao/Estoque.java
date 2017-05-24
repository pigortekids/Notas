package simulacao;

public class Estoque {
    
    private int quantidadeDeArroz;
    private int quantidadeDeFeijao;
    private int quantidadeDeCoca;
    private int quantidadeDeMinalba;
    private int quantidadeDeTelefone;
    private int minArroz;
    private int minFeijao;
    private int minCoca;
    private int minMinalba;
    private int minTelefone;
    private int maxArroz;
    private int maxFeijao;
    private int maxCoca;
    private int maxMinalba;
    private int maxTelefone;
    
    public Estoque(int qA, int qF, int qC, int qM, int qT,
            int minA, int minF, int minC, int minM, int minT,
            int maxA, int maxF, int maxC, int maxM, int maxT){
        this.quantidadeDeArroz = qA;
        this.quantidadeDeTelefone = qC;
        this.quantidadeDeCoca = qT;
        this.quantidadeDeFeijao = qF;
        this.quantidadeDeMinalba = qM;
        this.minArroz = minA;
        this.minFeijao = minF;
        this.minCoca = minC;
        this.minMinalba = minM;
        this.minTelefone = minT;
        this.maxArroz = maxA;
        this.maxCoca = maxC;
        this.maxFeijao = maxF;
        this.maxMinalba = maxM;
        this.maxTelefone = maxT;
    }
    
    public boolean setQuantProduto(int quant, boolean adicionar, char produto){
        
        boolean sucesso = true;
        
        if(adicionar == true){
            switch(produto){
                case 'a':
                    this.quantidadeDeArroz += quant;
                    if(this.quantidadeDeArroz > this.maxArroz){
                        sucesso = false;
                    }
                case 'c':
                    this.quantidadeDeArroz += quant;
                    if(this.quantidadeDeArroz > this.maxArroz){
                        sucesso = false;
                    }
                case 't':
                    this.quantidadeDeArroz += quant;
                    if(this.quantidadeDeArroz > this.maxArroz){
                        sucesso = false;
                    }
                case 'f':
                    this.quantidadeDeArroz += quant;
                    if(this.quantidadeDeArroz > this.maxArroz){
                        sucesso = false;
                    }
                case 'm':
                    this.quantidadeDeArroz += quant;
                    if(this.quantidadeDeArroz > this.maxArroz){
                        sucesso = false;
                    }
            }
        }
        else{
            switch(produto){
                case 'a':
                    if(this.quantidadeDeArroz - quant < 0){
                        sucesso = false;
                    }
                    else{
                        this.quantidadeDeArroz -= quant;
                    }
                case 'c':
                    if(this.quantidadeDeCoca - quant < 0){
                        sucesso = false;
                    }
                    else{
                        this.quantidadeDeCoca -= quant;
                    }
                case 't':
                    if(this.quantidadeDeTelefone - quant < 0){
                        sucesso = false;
                    }
                    else{
                        this.quantidadeDeTelefone -= quant;
                    }
                case 'f':
                    if(this.quantidadeDeFeijao - quant < 0){
                        sucesso = false;
                    }
                    else{
                        this.quantidadeDeFeijao -= quant;
                    }
                case 'm':
                    if(this.quantidadeDeMinalba - quant < 0){
                        sucesso = false;
                    }
                    else{
                        this.quantidadeDeMinalba -= quant;
                    }
            }
        }
        return sucesso;
    }
    
}
