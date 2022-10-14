package br.com.Pratica4;

public class Ancestral {
    String rgFunc, nomeFunc;
    double salarioFixo;


    public Ancestral(String rgFunc, String nomeFunc, double salarioFixo) {
        this.rgFunc = rgFunc;
        this.nomeFunc = nomeFunc;
        this.salarioFixo = salarioFixo;
    }

    public String getRgFunc() {
        return rgFunc;
    }

    public void setRgFunc(String rgFunc) {
        this.rgFunc = rgFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
