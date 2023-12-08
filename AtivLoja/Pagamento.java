package com.mycompany.loja;
import java.util.*;

public class Pagamento implements Avista, Cartao, Pix {
    private int id;
    private double valorOriginal;
    private double valorCalculado;
    private int tipoPagamento;
    Cliente cli;
    
    Pagamento(int id, double valorOriginal, int tipoPagamento){
        this.id = id;
        this.valorOriginal = valorOriginal;
        this.tipoPagamento = tipoPagamento;
    }

    public void setCliente(Cliente cli){
        this.cli = cli;
    }
    
    public void calcularPagamento(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para pagar a Vista, 2 para Cartao e 3 para pix");
        tipoPagamento = scan.nextInt();
        
        switch(tipoPagamento){
            case 1:
                calcularAvista();
            case 2: 
                calcularCartao();
            case 3:
                calcularPix();
            default:
                System.out.println("Inválido");
                break;
        }
    }
    
    @Override
    public double calcularAvista(){
        return valorOriginal * 0.9;
    }
    
    @Override
    public double calcularCartao(){
        return valorOriginal * 1.05;
    }
    
    @Override
    public double calcularPix(){
        return valorOriginal * 0.95;
    }
    
    public int getId() {
        return id;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public double getValorCalculado() {
        return valorCalculado;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public void setValorCalculado(double valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
}
