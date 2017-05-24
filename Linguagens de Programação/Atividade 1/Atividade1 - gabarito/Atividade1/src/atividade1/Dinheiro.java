package atividade1;

public class Dinheiro {
    private double valor;
    private String moeda;
    static private double taxaEuroDolar = 1.0811;
    static private double taxaRealDolar = 3.08;
    
    public Dinheiro(double v, String mo){
        this.valor = v;
        this.moeda = mo;
    }
    
    public double realParaDolar (double valor) {
        return ( valor * Dinheiro.taxaRealDolar ) ;
    }
    
    public double dolarParaReal (double valor) {
        return ( valor / Dinheiro.taxaRealDolar ) ;
    }
    
    public double euroParaDolar (double valor) {
        return ( valor * Dinheiro.taxaEuroDolar ) ;
    }
    
    public double dolarParaEuro (double valor) {
        return ( valor / Dinheiro.taxaEuroDolar ) ;
    }
    
    public double valorEmReal (double valor) {
        
        switch(this.moeda){
            case "dolar":
                return this.dolarParaReal(this.valor);
            case "euro":
                return this.dolarParaReal(euroParaDolar(this.valor));
            case "real":
                return this.valor;
            default:
                return 0;
        }
        
    }
    
    public double valorEmDolar (double valor) {
        
        switch(this.moeda){
            case "real":
                return this.realParaDolar(this.valor);
            case "euro":
                return this.euroParaDolar(this.valor);
            case "dolar":
                return this.valor;
            default:
                return 0;
        }
        
    }
    
    public double valorEmEuro (double valor) {
        
        switch(this.moeda){
            case "dolar":
                return this.dolarParaEuro(this.valor);
            case "real":
                return this.dolarParaEuro(realParaDolar(this.valor));
            case "euro":
                return this.valor;
            default:
                return 0;
        }
        
    }
    
    public double getTaxaRealDolar () {
        return Dinheiro.taxaRealDolar;
    }
    
    public double getTaxaEuroDolar () {
        return Dinheiro.taxaEuroDolar;
    }
    
    public String getMoeda () {
        return this.moeda;
    }
    
    public boolean setMoeda (String mo) {
        
        boolean resultado;
        
        switch(mo){
            case "real":
            case "dolar":
            case "euro":
                this.moeda = mo;
                resultado = true;
                break;
            default:
                resultado = false;
        }
        
        return resultado;
        
    }
    
    static public boolean alterarTaxaRealDolar (double v) {
        
        if(v<=0){
            Dinheiro.taxaRealDolar = v;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    static public boolean alterarTaxaEuroDolar (double v) {
        
        if(v<=0){
            Dinheiro.taxaEuroDolar = v;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public void setValorEmReal(double v){
        switch (this.moeda){
            case "dolar": 
                this.valor = this.realParaDolar(v);
                break;
            case "euro":
                this.valor = this.dolarParaEuro(this.realParaDolar(v));
                break;
            default:
                this.valor = v;
        }
    }
    
    
}
