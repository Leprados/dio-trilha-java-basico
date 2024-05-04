
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception 
    {    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por Favor digite numero da Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Você digitou: " + agencia);

        System.out.println("Por Favor digite o numero da sua conta");
        int conta = scanner.nextInt();
        System.out.println("Você digitou: " + conta);

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.nextLine();
        System.out.println("Você digitou: " + nomeCliente);
        
        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();
        System.out.println("Você digitou: " + saldo);
        
         scanner.close();
       {
         System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + "e seu saldo " + saldo + " já está disponível para saque");
       
    
       }
       
     
    }  
}
