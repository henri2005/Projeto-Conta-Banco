/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBanco;

/**
 *
 * @author Cliente
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe seu nome e sobrenome: ");
        String nomeCliente = sc.next();
        
        System.out.println("Informe o número da agência: ");
        String agencia = sc.next();
        
        System.out.println("Insira o número da sua conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Qual o saldo atual? ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! Sua agência é a " + agencia + ", conta " + numero + " e seu saldo atual é de " + saldo + " já está disponível para saque!");
    }
    
}
