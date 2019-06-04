package Questoes1e2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Petrônio
 */
public class TestaAnimais {
    public static void main(String[] args) {
        Papagaio p = new Papagaio("Loro", true, "Olá mundo");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("Arara", true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Rex", 4, true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Mimosa", 4, true);
        v.talk();
        v.imprime();
        

    }
}
