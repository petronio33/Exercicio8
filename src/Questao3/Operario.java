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
public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;
    
    public Operario(String n, String e, String t, int codSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(n, e, t, codSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double calcularSalario() {
        return super.calcularSalario() + (getValorProducao() * getComissao());
    }
    
}