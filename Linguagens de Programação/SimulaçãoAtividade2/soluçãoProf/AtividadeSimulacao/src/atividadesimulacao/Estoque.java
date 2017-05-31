/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulacao;

/**
 *
 * @author Tiago-note
 */
public class Estoque {

    private ICarregavel produto;
    private int qtdAtual;
    private int qtdMax;
    private int qtdMin;
    
    public Estoque ( int max, int min, int atual, ICarregavel produto ){
        
        this.qtdMax = max;
        this.qtdMin = min;
        this.qtdAtual = atual;
        this.produto = produto; 
        
    }
    
    
    public boolean retirarEstoque( int qtd ){
        boolean retorno = false;
        
        if ( (this.qtdAtual - qtd) >= 0 ){
            this.qtdAtual -= qtd;
            if ( this.qtdAtual <= this.qtdMin ){
                System.out.println("Estoque de " + this.produto.getNome() + " baixou do limite mínimo. Faça um pedido ao fornecedor.");
            }
            retorno = true;
        }
        
        return retorno;        
    }
    
    public void reporEstoque( int qtd ){
        this.qtdAtual += qtd;
        
        if ( this.qtdAtual > this.qtdMax ){
            System.out.println("Estoque de " + this.produto.getNome() + " excedeu o limite de armazenamento.");
        }
    }
    
    
    public boolean verificarSeEstoqueSuficiente( int qtd ){
    
        return ( qtd <= this.qtdAtual );
    }
    

    /**
     * @return the qtdAtual
     */
    public int getQtdAtual() {
        return this.qtdAtual;
    }

    /**
     * @return the qtdMax
     */
    public int getQtdMax() {
        return this.qtdMax;
    }

    /**
     * @param qtdMax the qtdMax to set
     */
    public void setQtdMax(int qtdMax) {
        this.qtdMax = qtdMax;
    }

    /**
     * @return the qtdMinima
     */
    public int getQtdMin() {
        return this.qtdMin;
    }

    /**
     * @param qtdMinima the qtdMinima to set
     */
    public void setQtdMin(int qtdMinima) {
        this.qtdMin = qtdMinima;
    }
    
    
    
}
