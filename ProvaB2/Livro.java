
package com.mycompany.modelagem;
import java.util.*;

public class Livro extends Publicacao implements iFisico, iOnline{
    private int capitulos;
    private String sobreAutor;

    public Livro(int capitulos, String sobreAutor, String titulo, int caracteres) {
        super(titulo, caracteres);
        this.capitulos = capitulos;
        this.sobreAutor = sobreAutor;
    }
    
    
    
    @Override
    public void imprimirInformacoes(){
        System.out.println("Titulo: " +titulo);
        System.out.println("Capitulos: "+capitulos);
    }

    public int getCapitulos() {
        return capitulos;
    }

    public String getSobreAutor() {
        return sobreAutor;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public void setSobreAutor(String sobreAutor) {
        this.sobreAutor = sobreAutor;
    }
    
    @Override
    public void folhear(){
        System.out.println("Folhear");
    }
    @Override
    public void rolar(){
        System.out.println("Rolar");
    }
}
