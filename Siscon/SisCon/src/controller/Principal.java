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
        ContaCorrente cc = new ContaCorrente("Banco Itaú", "000-1", 1234, 20000);
        Carteira carteira = new Carteira("Carteira Azul");
        Poupanca poupanca = new Poupanca("ModalMais S/A", "000-2", 1234567, 26);
        
        System.out.println(cc.getNome());
        System.out.println(cc.getAgencia());
        System.out.println(cc.getNumero());
        System.out.println(cc.getLimite() + "\n\n");
        
        System.out.println(carteira.getNome() + "\n\n");
        
        System.out.println(poupanca.getNome());
        System.out.println(poupanca.getAgencia());
        System.out.println(poupanca.getNumero());
        System.out.println(poupanca.getAniversario());
        
        
        
       
    }
}
