/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class Poupanca extends Banco{
    private int aniversario;

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if(aniversario >= 1 && aniversario <= 28)this.aniversario = aniversario;
        else throw new IllegalArgumentException("O aniversário deve estar entre o dia 1 e 28.");
    }
    
    public void calcularRendimento(){
    }
    
    public Poupanca (String nome, String agencia, int numero){
        this(nome, agencia, numero,0);
    }
    
    public Poupanca (String nome, String agencia, int numero, int aniversario){
        super(nome, agencia, numero);
        setAniversario(aniversario);
    }
}
