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
public class Empregado extends Pessoa{
    private int codSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String n, String e, String t, int codSetor, double salarioBase, double imposto){
        super(n, e, t);
        setCodSetor(codSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);        
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario(){
        return salarioBase - (salarioBase * imposto / 100);
    }

    double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
