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
public class Funcionariohorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas; 
    




    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

public Funcionariohorista(double valorHora, int horasTrabalhadas, int numeroMatricula, String nomeFuncionario){
    super(numeroMatricula, nomeFuncionario);
    this.valorHora=valorHora;
    this.horasTrabalhadas=horasTrabalhadas;

}
@Override
public void ImprimeDados(){
}
}
    


  

