package br.com.Pratica4;

public class Vendedor extends Ancestral {
    double totalVendas;

    public Vendedor(String rgFunc, String nomeFunc, double salarioFixo) {
        super(rgFunc, nomeFunc, salarioFixo);
    }
    public void acumulaVendas(double vendas){
        totalVendas+=vendas;

    }
    public double imprimeSalario(){
        return getSalarioFixo()+(totalVendas*0.05);
    }
}

