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
public class PalletRetangular extends Pellet {
    
    public PalletRetangular (  ){
        this.dim.altura = 0.1;
        this.dim.comprimento = 1;
        this.dim.largura = 1.4;
        this.carregado = false;
    }

    static public int qtdProdutos(ICarregavel produto) {
        
        return 10;
    }
    
}
