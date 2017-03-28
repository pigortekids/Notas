package atividade1;

public class Conta 
{
    //variaveis
    private int agencia;
    private int cc;
    private Cliente titular;
    private Dinheiro saldo;
    private Dinheiro limite;
    
    
    //Contructor
    public Conta(String n, String s, int i, String c, double v, String mo, double l){
        this.titular = new Cliente(n,s,i,c);
        this.saldo = new Dinheiro(v, mo);
        this.limite = new Dinheiro(l, mo);
    }
    
    
    //setters
    private void setTitular(Cliente C){
        this.titular = C;
    }
    
    private void setAgencia(int n){
       this.agencia = n;
    }
    
    private int getAgencia(){
        return this.agencia;
    }
    
    private void setCc(int n){
        this.cc = n;
    }
    
    private int getCc(){
       return this.cc;
    }   
    
    //getters
    public void visualizarSaldo ()
    {
        System.out.println("Saldo: "+ this.saldo + " BRL");
    }
    
    
    //metodos
    
    public void visualizarConta(){
        System.out.println("Titular: " + this.titular.getNome() + " " + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
        System.out.println("Agecia: "+ this.agencia + " cc:" + this.cc);
        this.visualizarSaldo();
    }
    
    //valor sempre em real
    public boolean depositar (double valor)
    {
        if(valor >= 0)
        {
            double v = this.saldo.valorEmReal(valor) + valor;
            this.saldo.setValorEmReal(v);
            return true;
        }
        else
        {
            System.out.println("Operacao Invalida.");
            return false;
        }
    }
    
    //valor sempre em real
    public boolean sacar (double valor)
    {
        if(valor > 0 && valor <= this.saldo.valorEmReal(valor) + this.limite.valorEmReal(valor))
        {
            double v = this.saldo.valorEmReal(valor) - valor;
            this.saldo.setValorEmReal(v);
            return true;
        }
        else
        {
            System.out.println("Operacao Invalida, nao ha saldo suficiente.");
            return false;
        }
    }
    
    //valor sempre em real
    public boolean transferirDinheiro (Conta conta, double valor)
    {
            if (this.sacar(valor))
            {
                System.out.println("Transferencia OK");
                return conta.depositar(valor);
            }
            else
                return false;
    }
}