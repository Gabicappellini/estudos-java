import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
//8 - Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após,
//calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também verificar se
//saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever
//a mensagem 'Saldo Negativo'.

        Scanner ler = new Scanner(System.in);
        String conta;
        float saldo;
        float debito;
        float credito;
        System.out.print("Conta:");
        conta = ler.next();
        System.out.print("Saldo:");
        saldo = ler.nextFloat();
        System.out.print("Valores em dívidas:");
        debito = ler.nextFloat();
        System.out.print("Valores de créditos:");
        credito = ler.nextFloat();

        float saldoAtual = saldo - debito + credito;
        System.out.print("O seu saldo na conta: " + conta + "é de: " + saldoAtual);

    }
}