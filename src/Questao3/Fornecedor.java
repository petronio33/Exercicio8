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
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(String n, String e, String t, double valorCredito, double valorDivida){
        super(n, e, t);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }
    
}
