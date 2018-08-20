/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

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
        Empregado e = new Empregado("Pedro", "50", "1.15", "M", 2000.0);
        
        Vendedor v = new Vendedor(2000.0,"paulo", "30", "1.80", "M", 2000.0, 500.0);
        
        
        JOptionPane.showMessageDialog(null,"Dados do empregado");
         JOptionPane.showMessageDialog(null,"Nome:"+e.getNome());
                 JOptionPane.showMessageDialog(null,"Idade:"+e.getIdade());
                         JOptionPane.showMessageDialog(null,"Altura:"+e.getAltura());
                                 JOptionPane.showMessageDialog(null,"Sexo:"+e.getSexo());
                                         JOptionPane.showMessageDialog(null,"Salario:"+e.getSalario());
        
                JOptionPane.showMessageDialog(null,"Dados do vendedor");
                
               
                        JOptionPane.showMessageDialog(null, "Salario:"+v.getSalario());
                                JOptionPane.showMessageDialog(null,"Nome:"+v.getNome());
                                        JOptionPane.showMessageDialog(null,"Idade:"+v.getIdade());
                                                JOptionPane.showMessageDialog(null,"Altura:"+v.getAltura());
                                                        JOptionPane.showMessageDialog(null,"Sexo:"+v.getSexo());
                                                                JOptionPane.showMessageDialog(null,"Valor das Vendas:"+v.getValorVendas());
                                                                        JOptionPane.showMessageDialog(null,"Comissao:"+v.getComissao());
                                                                                JOptionPane.showMessageDialog(null,"ObterLucros:"+v.obterLucros());
    }
    
}
