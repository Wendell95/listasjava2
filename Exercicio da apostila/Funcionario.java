/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkkk;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private  int numeroMatricula;
    private String nomeFuncionario;

    public Funcionario(int numeroMatricula, String nomeFuncionario){
        this.numeroMatricula=numeroMatricula;
        this.nomeFuncionario=nomeFuncionario;
    }

public void ImprimeDados(){


}

   public int getNumeroMatricula() {
    return numeroMatricula;
   }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

   
}
