// Rodrigo Franciozi 14.04014-0
//Igor Amaral 15.00588-7

package atividade2;

public class Pedido implements IResumo{
    
    private Cliente cliente;
    private Carrinho carrinho;
    private static int numeroP = 0;
    
    public Pedido(Cliente cliente, Carrinho carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    @Override
    public String retornarResumo(){
        String retorno = "Número do pedido: " + Pedido.numeroP + "\n" + carrinho.retornarResumo();
        retorno += cliente.retornarResumo();
        double total = 0;
        int quantidade = 0;
        for(int i = 0 ; i<carrinho.lista.length ; i++){
            if(carrinho.lista[i] != null){
                total += carrinho.lista[i].getPreco();
            }
        }
        retorno += "\nVocê comprou " + AtividadeSubmarino.quantidade + " itens\n";
        retorno += "Um boleto foi enviado para o email " + this.cliente.getEmail();
        retorno += ". Obrigado pela preferência! :D";
        return retorno;
    }
    
    public void maisUmPedido(){
        numeroP += 1;
    }
    
}
