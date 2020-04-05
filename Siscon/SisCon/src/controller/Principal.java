/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import model.Carteira;
import model.ContaCorrente;
import model.Poupanca;


public class Principal {
    public static void main(String[] args) {
        Carteira cart = new Carteira("Carteira Azul");
        ContaCorrente cc = new ContaCorrente("Banco Itaú","000-1",1234,200);
        Poupanca cp = new Poupanca("NUBANK","000-1",1234,16);
        
        cart.depositar(500);  
        System.out.println(cart);
        
        cc.depositar(500);
        System.out.println(cc);
        
        cp.depositar(500);
        System.out.println(cp);
        
        cart.sacar(10);
        System.out.println(cart);
        
        cc.sacar(10);
        System.out.println(cc);
        
        cp.sacar(10);
        System.out.println(cp);
        
       
    }
}
