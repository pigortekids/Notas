// Rodrigo Franciozi 14.04014-0
//Igor Amaral 15.00588-7

package atividade2;

public class Desejos extends Lista{
    
    public Desejos(){
        super(10, false);         
    }
    
    @Override
    public String retornarResumo(){
        
        String retorno = "";
        
        for(int i = 0 ; i<this.lista.length ; i++){
                retorno += this.lista[i].exibirInfos();
        }
        return retorno;
    }
    
}
