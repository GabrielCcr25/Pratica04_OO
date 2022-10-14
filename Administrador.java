package br.com.Pratica4;

public class Administrador extends Ancestral{
    int numHorasExtras;

    public Administrador(String rgFunc, String nomeFunc, double salarioFixo) {
        super(rgFunc, nomeFunc, salarioFixo);

    }
    public void acumulaHoraExtra(int numHorasExtras){
        numHorasExtras+=numHorasExtras;
    }
    public double PagamentoAdm(){
        return getSalarioFixo()+(numHorasExtras*1/getSalarioFixo());
    }
}
