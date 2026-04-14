package br.com.gov.sp.pg.fatec.oo;

public class CaixaEletronico {
    private double saldo;
    public boolean estaexibindo = true;

    public void setSaldo(double novoSaldo){
        if (saldo > 0) saldo = novoSaldo;
        else saldo = novoSaldo;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public double consultar(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        consultar();
    }

    public void sacar(double valor){
        saldo -= valor;
        consultar();
    }

    public void mostrarMenu(){
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
    }

    public int operacaoCaixa(int opcao){
        switch (opcao) {
        case 1:
            System.out.print("Seu saldo é: R$");
            consultar();
            break;
        case 2:
            System.out.print("Você está depositando: R$" + valor);
            depositar();
            break;
        case 3:
            System.out.print("Você está sacando: R$" + valor);
            sacar();
            break;
        case 4: 
            estaexibindo = false;
        default:
            System.out.println("Operação Inválida. \n Para sair, digite '4' ");
            break;
        }
    }

}
