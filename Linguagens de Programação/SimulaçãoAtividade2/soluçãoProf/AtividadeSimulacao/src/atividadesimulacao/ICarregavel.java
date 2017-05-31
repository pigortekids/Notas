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
public interface ICarregavel {
    
    public Dimensoes getDimensoes();
    public double getValor();
    public String getNome();
    public boolean seguroObrigatorio();
    
}
