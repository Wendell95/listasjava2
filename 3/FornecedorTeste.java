/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa1;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class FornecedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Paulo", "18", "1.60", "M");
       
        Fornecedor f = new Fornecedor("PEdro", "8", "1.50", "M", 300.0, 3000.0);
        
                
        JOptionPane.showMessageDialog(null, "Dados da pessoa");
        
        JOptionPane.showMessageDialog(null, "Nome:"+p.getNome());
         JOptionPane.showMessageDialog(null, "Idade:"+p.getIdade());
          JOptionPane.showMessageDialog(null, "Altura:"+p.getAltura());
           JOptionPane.showMessageDialog(null, "Sexo:"+p.getSexo());
           
            JOptionPane.showMessageDialog(null, "Dados do Fornecedor");
            
             JOptionPane.showMessageDialog(null, "Nome:"+f.getNome());
              JOptionPane.showMessageDialog(null, "Idade:"+f.getIdade());
               JOptionPane.showMessageDialog(null, "Altura:"+f.getAltura());
                JOptionPane.showMessageDialog(null, "Sexo:"+f.getSexo());
                 JOptionPane.showMessageDialog(null, "Credito maximo:"+f.getCreditoMaximo());
                  JOptionPane.showMessageDialog(null, "Valor em divida:"+f.getValorEmDivida());
                   JOptionPane.showMessageDialog(null,"Obter Saldo:"+f.ObterSaldo());
        
    }
    
    
    
}
