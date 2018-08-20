/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CookerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        animal a = new animal("Buldogue", "Marrom");
        Cachorro c = new Cachorro("rex", "Labrador", "Buldogue", "Marrom");
        
        
        Cooker co = new Cooker(true,"Xeque", "Cofap", "Rasteiro", "Preto");
        
        JOptionPane.showMessageDialog(null,"*************Dados do animal******************");
        
        JOptionPane.showMessageDialog(null,"tipo:"+a.getTipo());
        JOptionPane.showMessageDialog(null,"Cor:"+a.getCor());
        JOptionPane.showMessageDialog(null,  a.toString());
        JOptionPane.showMessageDialog(null,"**********************Dados do Cachorro******************");
        
        JOptionPane.showMessageDialog(null, "Nome:"+c.getNome());
        JOptionPane.showMessageDialog(null, "Raça:"+c.getRaca());
        JOptionPane.showMessageDialog(null, "Tipo:"+c.getTipo());
        JOptionPane.showMessageDialog(null, "Cor:"+c.getCor());
        JOptionPane.showMessageDialog(null,  c.toString());
        JOptionPane.showMessageDialog(null, "**********************Dados do Cooker*******************");
        
        JOptionPane.showMessageDialog(null,"Tosa:"+co.getTosa());
        JOptionPane.showMessageDialog(null,"Nome:"+co.getNome());
        JOptionPane.showMessageDialog(null,"Raça:"+co.getRaca());
        JOptionPane.showMessageDialog(null,"Tipo:"+co.getTipo());
        JOptionPane.showMessageDialog(null,"Cor:"+co.getCor());
    }
    
}
