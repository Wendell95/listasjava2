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
public class Cooker extends Cachorro {
    private Boolean tosa;

    public Cooker(Boolean tosa,String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa=tosa;
    }

    public Boolean getTosa() {
        return tosa;
    }

    public void setTosa(Boolean tosa) {
        this.tosa = tosa;
    }
    public Boolean precisaTosa(){
        return tosa;
    }
    
}
