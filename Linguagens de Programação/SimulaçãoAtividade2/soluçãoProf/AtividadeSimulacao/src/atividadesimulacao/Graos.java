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
public class Graos extends Produto implements ICarregavel{

    static enum tipoGrao { arroz, feijao };
    
    public Graos( tipoGrao tipo ){
 
        this.necessitaSeguro = false;
        
        this.dim = new Dimensoes();
        switch(tipo) {
            case arroz:
                this.nome = "Arroz";
                this.preco = 12;
                this.dim.altura = 21;
                this.dim.comprimento = 51;
                this.dim.largura = 39;               
                break;
            case feijao:
                this.nome = "Feijão";
                this.preco = 8;
                this.dim.altura = 5.5;
                this.dim.comprimento = 29;
                this.dim.largura = 20;              
                break;
        }        
        
    }
    
    @Override
    public Dimensoes getDimensoes(){
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
