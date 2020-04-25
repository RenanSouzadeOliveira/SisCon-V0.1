/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class Poupanca extends Banco implements AplicacaoFinanceira{
    private int aniversario;
    
    //Construtores
    public Poupanca (String nome, String agencia, int numero){
        this(nome, agencia, numero,0);
    }
    
    public Poupanca (String nome, String agencia, int numero, int aniversario){
        super(nome, agencia, numero);
        setAniversario(aniversario);
    }
    
    //Getter e Setters

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if(aniversario >= 1 && aniversario <= 28){
            this.aniversario = aniversario;
        } else{
            throw new IllegalArgumentException("O aniversário deve estar entre o dia 1 e 28.");
        }
    }
    
    //Métodos implementados       
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        } else if(valor > this.saldo){
            throw new RuntimeException("Não há saldo suficiente para o saque.");
        } else{
            this.saldo -= valor;
        }
    }
      
    @Override
    public void calcularRendimento(double taxa) {
        double juros = this.saldo * taxa;
        juros = Math.round(juros*100)/100;
        this.depositar(juros);
    }
    
    //ToString
    public String toString(){
        return ("Banco......: " + this.getNome() + "\n" +
                "Agência....: " + this.getAgencia() + "\n" +
                "Conta......: " + this.getNumero() + "\n" +
                "Saldo......:" + this.getSaldo() + "\n" +
                "Aniversário: " + this.getAniversario() + "\n"
                );
    }    
}
