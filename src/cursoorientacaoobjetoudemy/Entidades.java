/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoorientacaoobjetoudemy;

/**
 *
 * @author balta
 */
public class Entidades {
private String nome;    
private int numero;
private double saldo;    

public Entidades(){
    
}
public Entidades (int numero, String nome){
   this.nome=nome;  
    this.numero=numero;
    
}

public Entidades (int numero, String nome, double depositoInicial){
    this.nome=nome;  
    this.numero=numero;
    deposito(depositoInicial);
}


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        saldo+=valor;
    }
    public void saque(double valor){
        saldo-=valor+5.0;
    }

    public String toString(){
        return "Conta: "
                +numero
                + ", Nome: "
                +nome
                +", Saldo: R$ "
                +String.format("%.2f", saldo);
    }












    
}
