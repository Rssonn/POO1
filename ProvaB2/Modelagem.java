package com.mycompany.modelagem;
import java.util.* ;

public class Modelagem {

    public static void main(String[] args) {
  
        Autor a1 = new Autor("Autor1");
         Autor a2 = new Autor("Autor2");
        
         Livro l1 = new Livro(1, "titulo1", "sobre1", 1);
         
          Livro l2 = new Livro(2, "titulo2", "sobre2", 2);
          
          Artigo art1 = new Artigo(3, 3, "Titulo 3", 3);
           Artigo art2 = new Artigo(4, 4, "Titulo 4", 4);
           
           
            List<Autor>autoresMain = new ArrayList<>();
           autoresMain.add(a1);
           autoresMain.add(a2);
           
           List<Publicacao>publicacoesMain = new ArrayList<>();
           publicacoesMain.add(l1);
           publicacoesMain.add(l2);
           publicacoesMain.add(art1);
           publicacoesMain.add(art2);
           
          for(Autor a: autoresMain){
              System.out.println(a.getNome());
          }
            
         for(Publicacao p : publicacoesMain){
             System.out.println(l1);
             System.out.println(l2);
             System.out.println(art1);
             System.out.println(art2);
         }
          
    }
}
