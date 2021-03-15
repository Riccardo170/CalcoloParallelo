/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoloparallelo;

/**
 *
 * @author Utente
 */
public class Operazione5 extends Thread{
   Buffer dati;
    
    private double b=3;
    private double c;
    private double a=3;
    
    public Operazione5(Buffer d){
        dati=d;
        c= dati.c;
    }
    
    public void run(){
        dati.z = a* (c-b);
        System.out.println("Ho calcolato z : " + dati.z);
    }  
}
