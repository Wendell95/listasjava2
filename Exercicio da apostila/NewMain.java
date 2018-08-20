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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FuncionarioMensalista FM = new FuncionarioMensalista(35.0 , 2 , "Pedro");
        
        Funcionariohorista FH = new Funcionariohorista(12.0 , 3 , 1 , "Paulo");
        
       
        
        
        System.out.println("********************DADOS DO FUNCIONARIO MENSALISTA*************************");
        
        
         System.out.println("Salario mensal:" +FM.getSalarioMensal()); 
                 System.out.println("Numero da matricula:" + FM.getNumeroMatricula ());
               System.out.println("Nome do funcionario:" +FM.getNomeFuncionario ());
               
               
               System.out.println("****************************DADOS DO FUNCIONARIO HORISTA************************************");
               
         System.out.println("Valor da hora:"+FH.getValorHora());
                 System.out.println("Horas Trabalhadas:" +FH.getHorasTrabalhadas());
                 System.out.println("Numero da matricula:"+FH.getNumeroMatricula());
                 System.out.println("Nome do funcionario:"+FH.getNomeFuncionario());
    }
    
}
