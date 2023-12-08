package com.mycompany.loja;
import java.util.*;

public class Cliente {
   private String nome;
   private String cpf;
   List<Pagamento>pagamentos;
   
   Cliente(String nome, String cpf){
       this.nome = nome;
       this.cpf = cpf;
       pagamentos = new ArrayList();
   }
   
    public void adicionarPagamento(Pagamento x){
        pagamentos.add(x);
        x.setCliente(this);
    }
   
    public void imprimirCompras(){
        for (Pagamento p: pagamentos){
            System.out.println("Compra: "+p.getValorCalculado());
        }
    }
    
    public void valorGasto(){
        double total = 0;
        for(Pagamento p: pagamentos){
            total += p.getValorCalculado();
        }
     
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
   
}
