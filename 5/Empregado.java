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
public class Empregado {
     private String nome;
     private String idade;
     private String altura;
     private String sexo;
     double salario;
     
     public Empregado(String nome, String idade, String altura, String sexo, double salario){
         this.nome=nome;
         this.idade=idade;
         this.altura=altura;
         this.sexo=sexo;
         this.salario=salario;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
