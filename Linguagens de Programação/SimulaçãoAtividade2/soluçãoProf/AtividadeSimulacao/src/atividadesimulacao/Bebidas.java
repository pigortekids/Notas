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
public class Bebidas extends Produto implements ICarregavel {

    static enum tipoBebida { coca, minalba };
    
    public Bebidas ( tipoBebida tipo){
           
        this.necessitaSeguro = false;
        
        switch(tipo) {
            case coca:
                this.nome = "Coca-Cola";
                this.preco = 5;
                this.dim.altura = 5.5;
                this.dim.comprimento = 29;
                this.dim.largura = 20;               
                break;
            case minalba:
                this.nome = "Minalba";
                this.preco = 1.3;
                this.dim.altura = 21;
                this.dim.comprimento = 51;
                this.dim.largura = 39;               
                break;
        }

    }

    @Override
    public Dimensoes getDimensoes() {
        return this.dim;
    }

    @Override
    public double getValor() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean seguroObrigatorio() {
        return this.necessitaSeguro;
    }    
    
}
