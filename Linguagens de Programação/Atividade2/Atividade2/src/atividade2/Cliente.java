// Rodrigo Franciozi 14.04014-0
//Igor Amaral 15.00588-7

package atividade2;

public class Cliente implements IResumo{
    
    private String cpf;
    private String nome;
    private String endereco;
    private String cep;
    private String email;
            
    public Cliente(String cpf, String nome, String endereco, String cep, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }
    
    public String retornarResumo(){
        
        String retorno = "";
        
        retorno += this.nome + "\n";
        retorno += this.cpf + "\n";
        retorno += "Endereço de entrega: " + this.endereco + " - " + this.cep;

        return retorno;
    }
    
    public String getEmail(){
        return this.email;
    }
    
}
