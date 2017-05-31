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
public class Eletronico extends Produto implements ICarregavel {


    static enum tipoEletronico { celularG6 };
    
    public Eletronico ( tipoEletronico tipo){
        
        this.necessitaSeguro = true;
        
        switch(tipo) {
            case celularG6:
                this.nome = "Celular LG G6";
                this.preco = 2800;
                this.dim.altura = 5.5;
                this.dim.comprimento = 29;
                this.dim.largura = 20;               
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
