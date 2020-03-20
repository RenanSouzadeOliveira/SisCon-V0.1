/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

public class Conta {
    private String nome;
    private double saldo;

    public void setNome(String nome) {
        if (nome.length() >= 5)this.nome = nome;
        else throw new IllegalArgumentException("O nome de ter mais de 4 letras.");
    }


    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor){
        if (valor <= 0) throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        else if(valor > this.saldo) throw new RuntimeException("Não há saldo suficiente para o saque.");
        else this.saldo -= valor;
    }
    
    public void depositar(double valor){
        if (valor > 0) this.saldo += valor;
        else throw new IllegalArgumentException("O valor de depósito deve ser maior que zero.");
    }
    
    public Conta(String nome){
        setNome(nome);
    }
    
    public Conta(double saldo){
    }
}
