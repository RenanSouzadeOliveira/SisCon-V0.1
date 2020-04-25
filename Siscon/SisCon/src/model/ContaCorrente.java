/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class ContaCorrente extends Banco{
    private double limite;
    
    //Construtores
    public ContaCorrente(String nome, String agencia, int numero, double limite){
        super(nome,agencia,numero);
        setLimite(limite);        
    }
    
    public ContaCorrente(String nome, String agencia, int numero){
        this(nome, agencia, numero,0);
    }
    
    //Getters e Setters
    public void setLimite(double limite) {
       if(limite >= 0){
           this.limite = limite;
       } else {
           throw new IllegalArgumentException("O limite deve ser maior ou igual a zero.");
       }
    }

    public double getLimite() {
        return this.limite;
    }
    
    //Métodos Implementados
    public void pagar(){
    }
      
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        } else if(valor > (this.saldo + this.limite)){
            throw new RuntimeException("Não há saldo suficiente para o saque.");
        } else{
            this.saldo -= valor;
        }
    }
    
    //ToString
    public String toString(){
        return ("Banco.............: " + this.getNome() + "\n" +
                "Agência...........: " + this.getAgencia() + "\n" +
                "Conta.............: " + this.getNumero() + "\n" +
                "Saldo Atual.......: " + this.getSaldo() + "\n" +
                "Limite de Créditos: " + this.getLimite() + "\n"
                );
    }
}
