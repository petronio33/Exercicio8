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
public class Cachorro extends Mamifero {
    private boolean lateAlto;
    //////////////////////////////////////////////
    public Cachorro(String n, int p, boolean l){
        super(n);
        setPatas(p);
        isLatealto(l);       
    }
    ///////////////////////////////////
    public void talk(){
        System.out.println("Au, au");
    }
    ///////////////////////////
    public boolean getLateALto(){
        return this.lateAlto;
    }
    
    public void isLatealto(boolean l){
        this.lateAlto = l;        
    }
    ///////////////////////////
    
}
