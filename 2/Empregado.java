/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author PC
 */
public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, String idade, String altura, String sexo, double salario) {
        super(nome, idade, altura, sexo);
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double ObterLucros(){
        return salario;
    }
    
}
