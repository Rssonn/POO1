package com.mycompany.aula0927;

public class Chip {
    
    private String id;
    private String operadora;

    public Chip(String id, String operadora) {
        this.id = id;
        this.operadora = operadora;
    }

    public String getId() {
        return id;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    
    
}
