// Rodrigo Franciozi 14.04014-0
//Igor Amaral 15.00588-7

package atividade2;

public abstract class Lista implements IResumo{
    
    protected Produto[] lista;
    private int restantes;
    private boolean vendivel;
    
    public Lista(int maximo, boolean vendivel){
        this.lista = new Produto[maximo];
        this.restantes = maximo;
        this.vendivel = vendivel;
    }
    
    public void limparLista(){
        for(int i=0 ; i<lista.length ; i++){
            lista[i] = null;
        }
        restantes = lista.length;
    }
    
    public boolean removerUltimoDaLista(){
        boolean retorno = false;
        if (lista[0] != null){
            retorno = true;
            restantes += 1;
            for(int i=0 ; i<lista.length ; i++){
                if(i == lista.length - 1){
                    lista[i] = null;
                }
                else if(lista[i+1] == null){
                    lista[i] = null;
                }
            }
        }
        return retorno;
    }
    
    public boolean adicionarALista(Produto produto){
        boolean retorno = false;
        if(lista[lista.length-1] == null){
            retorno = true;
            restantes -= 1;
            for(int i=0 ; i<lista.length ; i++){
                if(lista[i] == null){
                    lista[i] = produto;
                    break;
                }
            }
        }
        return retorno;
    }
    
    public int getRestantes(){
        return this.restantes;
    }
    
}
