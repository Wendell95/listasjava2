/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro", "12", "1.60", "M");
        
        
        Empregado e = new Empregado("João", "15", "1.70", "F", 35.0);
        
        
                
        JOptionPane.showMessageDialog(null, "***********Dados da pessoa********");
        
        JOptionPane.showMessageDialog(null, "Nome:"+p.getNome());
        JOptionPane.showMessageDialog(null, "Idade:"+p.getIdade());
        JOptionPane.showMessageDialog(null, "Altura:"+p.getAltura());
        JOptionPane.showMessageDialog(null, "Sexo:"+p.getSexo());
        
        JOptionPane.showMessageDialog(null,"***********Dados do empregado********");
        JOptionPane.showMessageDialog(null, "Nome:"+e.getNome());
        JOptionPane.showMessageDialog(null, "Idade:"+e.getIdade());
        JOptionPane.showMessageDialog(null, "Altura:"+e.getAltura());
        JOptionPane.showMessageDialog(null, "Sexo:"+e.getSexo());
        JOptionPane.showMessageDialog(null, "Salario:"+e.getSalario());
        JOptionPane.showMessageDialog(null, "Retorno do salario:"+e.ObterLucros());
    }
    
}
