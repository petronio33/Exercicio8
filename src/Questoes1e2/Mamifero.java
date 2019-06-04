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
public class Mamifero extends Animal {
    private int patas;
    ///////////////////////////
    public int getPatas(){
        return this.patas;
    }
    
    public void setPatas(int p){
        this.patas = p;
    }
   //////////////////////////////
    
    public Mamifero(int p, String n){
        super(n);
        setPatas(p);
    }
    
}
