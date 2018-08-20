/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa1;

/**
 *
 * @author PC
 */
public class Fornecedor extends Pessoa {
    
    private double creditoMaximo;
    private double valorEmDivida;
    
    public Fornecedor(String nome, String idade, String altura, String sexo, double creditoMaximo, double valorEmDivida){
        super(nome, idade, altura, sexo);
        this.creditoMaximo=creditoMaximo;
        this.valorEmDivida=valorEmDivida;
    }

        public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    public String ObterSaldo(){
        return " credito maximo:"+getCreditoMaximo()+ ", Valor em divida:"+getValorEmDivida();
    }
    
   
        
    }

