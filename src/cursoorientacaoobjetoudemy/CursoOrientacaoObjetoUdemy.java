/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoorientacaoobjetoudemy;
import java.util.Scanner;

/**
 *
 * @author balta
 */
public class CursoOrientacaoObjetoUdemy {

    
    public static void main(String[] args) {
    double deposito,saque;    
    Scanner leia = new Scanner(System.in);
    
    char saldo;
    Entidades conta;
    System.out.print("Informe o numero da conta: ");
    int numero = leia.nextInt();
    
    System.out.print("Informe o nome do usuario da conta: ");
    leia.nextLine();
    String nome =leia.nextLine();
    
    System.out.print("Possui deposito inicial? (s/n)");
    saldo = leia.next().charAt(0);
    
    if(saldo=='s'|| saldo=='S'){
        System.out.print("Informe o valor do deposito inicial: ");
        double depositoInicial =leia.nextDouble();
        conta = new Entidades(numero, nome, depositoInicial);
   }else{
        conta = new Entidades(numero, nome);
    }
    
    System.out.println();
    System.out.println("Dados da conta: ");
    System.out.println(conta);
    
    System.out.println();
    System.out.print("Qual valor deseja depositar? ");
    deposito=leia.nextDouble();
    conta.deposito(deposito);
    System.out.println(conta);
    
     System.out.println();
    System.out.print("Qual valor deseja sacar? ");
    saque=leia.nextDouble();
    conta.saque(saque);
    System.out.println(conta);
    }
    
}
