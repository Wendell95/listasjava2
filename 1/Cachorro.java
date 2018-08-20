/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author aluno
 */
public class Cachorro extends animal{
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca, String tipo, String cor) {
        super(tipo, cor);
        this.nome=nome;
        this.raca=raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String toString(){
        return " nome: "+getTipo()+ " raca :"+this.getRaca();
    }
    
    
}
