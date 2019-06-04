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
public class Teste {
    public static void main(String[] args) {
        
        System.out.println("Fornecedor");
        Fornecedor f = new Fornecedor("Luciano", "Rua z", "99345890", 1110, 2110);
        System.out.println(f.obterSaldo());
        
        System.out.println("Empregado");
        Empregado e = new Empregado("Lucas", "Rua y", "98956412", 15, 1500, 9.2);
        System.out.println(e.calcularSalario());
        
        System.out.println("Administrador");
        Administrador a = new Administrador("Rafael", "Rua a", "998913795", 12, 4000, 13, 600);
        System.out.println(a.calcularSalario());
        
        System.out.println("Operario");
        Operario o = new Operario("Gustavo", "Rua b", "99745861", 11, 1400, 8.2, 2300, 1.2);
        System.out.println(o.calcularSalario());
    }
    
}