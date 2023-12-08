package com.mycompany.loja;

public class Loja {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Cliente1", "190123");
        Cliente c2 = new Cliente("Cliente2", "128740");
        
        Pagamento p1 = new Pagamento(123, 80, 1);
        Pagamento p2 = new Pagamento(124, 40, 2);
        Pagamento p3 = new Pagamento(103, 50, 3);
        Pagamento p4 = new Pagamento(263, 200, 1);
        Pagamento p5= new Pagamento(123, 90, 2);
        Pagamento p6 = new Pagamento(123, 30, 3);
        
        c1.adicionarPagamento(p1);
        c1.adicionarPagamento(p2);
        c1.adicionarPagamento(p3);
        
        c2.adicionarPagamento(p4);
        c2.adicionarPagamento(p5);
        c2.adicionarPagamento(p6);
        
        System.out.println("Cliente 1: ");
        c1.imprimirCompras();
        System.out.println("Valor gasto: ");
        c1.valorGasto();
        
        System.out.println("Cliente 2: ");
        c2.imprimirCompras();
        System.out.println("Valor gasto: ");
        c2.valorGasto();
    }
}
