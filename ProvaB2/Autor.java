
package com.mycompany.modelagem;
import java.util.*;

public class Autor {
     private String nome;
     public List<Publicacao> publicacoes;
     
    public Autor(String nome) {
        this.nome = nome;
        publicacoes = new ArrayList<>();
    }
    
    public void adiionarPublicacao(Publicacao p){
        publicacoes.add(p);
    }
    
    public void imprimirPublicacao(){
        for(Publicacao p : publicacoes){ 
        System.out.println("Titulo: "+ p.titulo);
        }
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
}
