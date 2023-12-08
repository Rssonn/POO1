package com.mycompany.modelagem;
import java.util.*;

public class Artigo extends Publicacao implements iOnline {
    private int topicos;
    private int resumo;

    public Artigo(int topicos, int resumo, String titulo, int caracteres) {
        super(titulo, caracteres);
        this.topicos = topicos;
        this.resumo = resumo;
    }

    public int getTopicos() {
        return topicos;
    }

    public int getResumo() {
        return resumo;
    }

    public void setTopicos(int topicos) {
        this.topicos = topicos;
    }

    public void setResumo(int resumo) {
        this.resumo = resumo;
    }
    
    
    @Override
    public void imprimirInformacoes(){
        System.out.println("Tiulo: "+titulo);
        System.out.println("Topicos: "+topicos);
    }
    
    @Override
    public void rolar(){
        System.out.println("Rolando");
    }
    
}
