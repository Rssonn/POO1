package com.mycompany.aula0927;

public class Telefone {
    
    private String numero;
    private Chip c;
    private Ddd d;
    private Pessoa p; 

    public Telefone(String numero, Ddd d, String nome, String rg) {
        this.numero = numero;
        this.d = d;
        this.p = new Pessoa(nome, rg);
    }

    public String getNumero() {
        return numero;
    }

    public Chip getC() {
        return c;
    }

    public void setC(Chip c) {
        this.c = c;
    }

    public Ddd getD() {
        return d;
    }

    public void setD(Ddd d) {
        this.d = d;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    

}
