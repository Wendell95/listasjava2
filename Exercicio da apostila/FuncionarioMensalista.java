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
public class FuncionarioMensalista extends Funcionario{
    private double salarioMensal;



    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

public FuncionarioMensalista(double salarioMensal, int numeroMatricula, String nomeFuncionario){
    super(numeroMatricula, nomeFuncionario);
    this.salarioMensal=salarioMensal;
}



public void imprimeDados(){
    
}
    
}

