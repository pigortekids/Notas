package simulacao;

import java.util.Scanner;

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
    
    public void viagem(Carreta carreta){
        
        Scanner scanner = new Scanner(System.in);
        boolean enquanto = true;
        boolean a, c, t, f, m = false;
        Bebida b//é isso
        int qA, qC, qT, qF, qM = 0;
        int qfA, qfC, qfT, qfF, qfM;
        int contador = 0;
        
        while(enquanto){
            System.out.println("1.Arroz Gostoso");
            System.out.println("2.Feijão Rosalito");
            System.out.println("3.Coca Cola");
            System.out.println("4.Minalba");
            System.out.println("5.LG G6");
            System.out.println("Digite o valor do produto que deseja");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    a = true;
                    contador+=1;
                    break;
                case 2:
                    f = true;
                    contador+=1;
                    break;
                case 3:
                    c = true;
                    contador+=1;
                    break;
                case 4:
                    m = true;
                    contador+=1;
                    break;
                case 5:
                    t = true;
                    contador+=1;
                    break;
                default:
                    System.out.println("Valor digitado inválido");
                    break;
            }
            System.out.println("Deseja encaminhar mais um produto?\n1.sim\n0.não");
            int coisa = scanner.nextInt();
            if(coisa == 0){
                enquanto = false;
            }
            int pQ = carreta.quantosCabe();
            int quant = (int)(carreta.getLargura() / 10);
            int pR = quant - carreta.quantosCabe();
            quant = pR + pQ;
            int qProdutos;
            for(int i=0; i<quant % contador ; i++){
                if(a){
                    qA = quant/contador + 1 * 25;
                }
                if(c){
                    qC = quant/contador + 1 * 25;
                }
                if(t){
                    qT = quant/contador + 1 * 25;
                }
                if(f){
                    qF = quant/contador + 1 * 25;
                }
                if(m){
                    qM = quant/contador + 1 * 25;
                }
            }
            Retangulo R = new Retangulo();
            Quadrado Q = new Quadrado();
            for(int i = 0 ; i<pQ ; i++){
                if(pA>0){
                    qA -= 1;
                    pQ -= 1;
                    qfA += Q.quantCabe(qProdutos)
                }
            }
            for(int i = 0 ; i<pR ; i++){
                
            }
        }
    }
    
}
