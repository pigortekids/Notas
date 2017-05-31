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
public abstract class Pellet {
    protected boolean carregado;
    protected Dimensoes dim;
    protected ICarregavel produto;
    
    public boolean getCarregado(){
        return this.carregado;
    }
    
    public void esvaziarPallet(){
        this.carregado = false;
    }
    
}
