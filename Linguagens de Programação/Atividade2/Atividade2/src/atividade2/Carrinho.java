// Rodrigo Franciozi 14.04014-0
//Igor Amaral 15.00588-7

package atividade2;

public class Carrinho extends Lista{
    
    
    public Carrinho(){
        super(4, true);
    }
    
    @Override
    public String retornarResumo(){
        
        String retorno = "";
        double total = 0;
        
        for(int i = 0 ; i<this.lista.length ; i++){
            if(this.lista[i] != null){
                total += this.lista[i].getPreco();
                retorno += this.lista[i].exibirInfos();
            }
        }   
        retorno += "\nTotal = " + total + "\n";
        return retorno;
    }

}
