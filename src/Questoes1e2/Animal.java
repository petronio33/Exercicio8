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
public class Animal {
    private String nome;
    //////////////////////////
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    ////////////////////////////
      
    public void imprime(){
        System.out.println("Nome do animal: "+getNome());
    }
    
    public void talk(){
        
    }
    //////////////////////////////////
    public Animal(String n){
       setNome(n);
    }
    
}