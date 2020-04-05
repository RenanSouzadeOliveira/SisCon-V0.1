/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class Carteira extends Conta{
    private void pagar(){
    }
    
    public Carteira(String nome){
        super(nome);
    }
    
    public Carteira(){
        this("Carteira");
    }
    
    public String toString(){
        return (this.getNome() + ": R$ " + getSaldo() + "\n");
    }
    
    public void sacar(double valor){
        if (valor <= 0) throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        else if(valor > this.saldo) throw new RuntimeException("Não há saldo suficiente para o saque.");
        else this.saldo -= valor;
    };
}
