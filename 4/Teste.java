/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Administrador a = new Administrador("Paulo", "12", "1.80", "M", 12.0, 300.0);
    
    Empregado e = new Empregado("Pedro", "20", "1.50", "M");


JOptionPane.showMessageDialog(null,"Dados do Administrador");

JOptionPane.showMessageDialog(null,"Nome:"+a.getNome());
JOptionPane.showMessageDialog(null,"Idade:"+a.getIdade());
JOptionPane.showMessageDialog(null,"Altura:"+a.getAltura());
JOptionPane.showMessageDialog(null, "Sexo:"+a.getSexo());
JOptionPane.showMessageDialog(null, "Ajudas de custo:"+a.getAjudasDeCusto());
JOptionPane.showMessageDialog(null, "Salario:"+a.getSalario());
JOptionPane.showMessageDialog(null, "Obter Lucros:"+a.ObterLucros());

JOptionPane.showMessageDialog(null, "Dados do Empregado");

JOptionPane.showMessageDialog(null, "Nome:"+e.getNome());
JOptionPane.showMessageDialog(null, "Idade:"+e.getIdade());
JOptionPane.showMessageDialog(null, "Altura:"+e.getAltura());
JOptionPane.showMessageDialog(null, "Sexo:"+e.getSexo());

    }}
    
    

