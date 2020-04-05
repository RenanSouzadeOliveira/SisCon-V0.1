/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

public abstract class Conta {
    private String nome;
    protected double saldo;

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
    
    public abstract void sacar(double valor);
    
    
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
