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
public class Operazione1 extends Thread{
    
    Buffer dati;
    private double b=1;
    private double c= 3;
    private double a;
    
    public Operazione1(Buffer d){
        dati=d;
        a= dati.a;
    }
    public void run(){
        dati.x = c* (a-b);
        System.out.println("Ho calcolato x : " + dati.x);
    }
}
