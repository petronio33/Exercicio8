/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author Petrônio
 */
public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String n, String e, String t, int codSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(n, e, t, codSetor, salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }
    
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    //override
    public double calcularSalario(){
        return super.calcularSalario() + getAjudaDeCusto();
    } 
    
    
}
