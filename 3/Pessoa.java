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
public class Pessoa {
    private String nome;
    private String idade;
    private String altura;
    private String sexo;

    public Pessoa(String nome, String idade, String altura, String sexo){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
        this.sexo=sexo;
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
    
}
