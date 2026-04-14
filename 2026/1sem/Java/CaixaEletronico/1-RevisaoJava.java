
import java.util.Scanner;


public class DesafioCaixaEletronico {
    public static void main(String[] args) {
        
        // decalaração de variáveis
        double saldo = 2500.00;
        int op = 1;
        double deposito;
        double saque;
        double valor;
        boolean exibir = true;
        
        Scanner cliente = new Scanner(System.in);
        
        // processamento de dados - inicio do laço
        while (exibir == true) {
        // apresentação banco
        System.out.println("==========================");
        System.out.println("    APP Banco Incrivel");
        System.out.println("==========================");
        System.out.println(" ");
        System.out.println("Escolha uma operacao: ");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar valor");
        System.out.println("3 - Sacar valor");
        System.out.println("4 - Sair");
        System.out.print(" Sua opcao: ");
        op = cliente.nextInt();
        System.out.println("--------------------------");
        
        if (op == 1) {
          System.out.println("Voce escolheu: 1 - Consultar saldo ");
          System.out.println("Seu saldo eh: R$" + saldo);
          System.out.println("------------------------------------");
          
          // limpando a tela
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
        } else 
          { if (op == 2) {
            System.out.println("Voce escolheu: 2 - Depositar valor ");
            System.out.print("Informe o valor a ser depositado: R$");
            valor = cliente.nextDouble();
              if (valor > 0){
                saldo = saldo + valor; 
              }
            System.out.println("Seu saldo eh: " + saldo);
            // limpando a tela
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
          } else 
            {if (op == 3) {
              System.out.println("Voce escolheu: 3 - Sacar valor ");
              System.out.print("Informe o valor a ser sacado: R$");
              valor = cliente.nextDouble();
              if (valor <= saldo){
                saldo = saldo - valor; 
              } else
                System.out.println("Saldo insuficiente para sacar R$" + valor);
            
              System.out.println("Seu saldo eh: " + saldo);
              
              // limpando a tela
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
            } else 
              {if (op == 4){
                System.out.println("Obrigada por confiar seu dinheiro a nos!");
                System.out.println("==========================");
                System.out.println(" ");
                exibir = false;
                // limpando a tela
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              System.out.println(" ");
              } else 
              { System.out.println(" Opcao invalida!");
                System.out.println(" Para sair, digite 4");
                System.out.println(" "); 
                  // limpando a tela
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
                  System.out.println(" ");
              }
              }
              
            }
          }
       
        /* opções do menu
        1 - consultar
        2 - depositar 
        3 - sacar
        4 - sair 
        */
          
        }
       
        
    }
}
