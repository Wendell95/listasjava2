/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

/**
 *
 * @author PC
 */
public class Vendedor extends Empregado{
     private double valorVendas;
     private double comissao;
  

    public Vendedor(double salario,String nome, String idade, String altura, String sexo, double valorVendas, double comissao) {
        super(nome, idade, altura, sexo, salario);
        this.valorVendas=valorVendas;
        this.comissao=comissao;
       
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
     
     public double obterLucros(){
         return salario + comissao;
     }
     
     
}
