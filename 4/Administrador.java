/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

/**
 *
 * @author PC
 */
public class Administrador extends Empregado {
    
    private double ajudasDeCusto;
    private double salario;
    public Administrador(String nome, String idade, String altura, String sexo, double ajudasDeCusto, double salario){
        super(nome, idade, altura,sexo);
        this.ajudasDeCusto=ajudasDeCusto;
        this.salario=salario;
    }
    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    public double ObterLucros(){
       return getSalario() + ajudasDeCusto; 
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
