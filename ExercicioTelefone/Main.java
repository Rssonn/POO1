package com.mycompany.aula0927;

public class Aula0927 {

    public static void main(String[] args) {
        
        Ddd d1 = new Ddd("27", "ES");
        Ddd d2 = new Ddd("11", "SP");

        Chip c1 = new Chip("01", "Vivo");
        Chip c2 = new Chip("02", "Claro");

        Telefone t1 = new Telefone("936521478", d1, "Cassio", "32165");
        t1.setC(c1);
        
     
        System.out.println(t1.getP().getNome());
    
        
    
    
    }
}
