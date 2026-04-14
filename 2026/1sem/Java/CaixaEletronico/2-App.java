import br.com.gov.sp.pg.fatec.oo.CaixaEletronico;
import br.com.gov.sp.pg.fatec.oo.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cliente = new Scanner(System.in);
        CaixaEletronico Conta1 = new CaixaEletronico();

        int op;
        double valor = 0;

        Conta1.setSaldo(1500);
        Conta1.estaexibindo = true;

        while (Conta1.estaexibindo == true) {
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
                System.out.println("Seu saldo eh: R$" + Conta1.consultar());
                System.out.println("------------------------------------");
            } else {
                if (op == 2) {
                    System.out.println("Voce escolheu: 2 - Depositar valor ");
                    System.out.print("Informe o valor a ser depositado: R$");
                    valor = cliente.nextDouble();

                    if (valor > 0)
                        Conta1.depositar(valor);
                    else
                        System.out.println("Valor insuficiente para depositar.");

                }

                else if (op == 3) {
                    System.out.println("Voce escolheu: 3 - Sacar valor ");
                    System.out.print("Informe o valor a ser sacado: R$");
                    valor = cliente.nextDouble();

                    if (valor <= Conta1.getSaldo()) {
                        Conta1.sacar(valor);
                    } else
                        System.out.println("Saldo insuficiente para sacar R$" + valor);

                    System.out.println("Seu saldo eh: " + Conta1.getSaldo());
                } else {
                    if (op == 4) {
                        System.out.println("Obrigada por confiar seu dinheiro a nos!");
                        System.out.println("==========================");
                        System.out.println(" ");
                        Conta1.estaexibindo = false;
                    } else {
                        System.out.println(" Opcao invalida!");
                        System.out.println(" Para sair, digite 4");
                        System.out.println(" ");

                    }
                }

            }
        }
    }
}
