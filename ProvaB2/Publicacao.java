
package com.mycompany.modelagem;
import java.util.*;

public abstract class Publicacao {
    public String titulo;
    public int caracteres;
    List<Autor>autores;

    public Publicacao(String titulo, int caracteres) {
        this.titulo = titulo;
        this.caracteres = caracteres;
        autores = new ArrayList<>();
    }
    
    public void adicionarAutor(Autor a){
        autores.add(a);
    }
    
    public void imprimirAutor(){
        for(Autor a : autores){
            System.out.prinln("Nome: "+a.nome);
        }
    }
    
    public abstract void imprimirInformacoes();
}
