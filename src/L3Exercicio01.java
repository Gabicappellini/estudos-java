import java.util.Scanner;

public class L3Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        escrever("Produto:");
        String descricao = ler.next();

        escrever("Qual a quantidade de " + descricao);
        double quantidade = ler.nextInt();

        escrever("Qual o preço unitário de " + descricao);
        double valorUnitario = ler.nextDouble();

        if (quantidade <= 5) {
            desconto2perCent(quantidade, valorUnitario);
        }
        if (quantidade > 5 || quantidade <= 10) {
            desconto3perCent(quantidade, valorUnitario);
        }
        if (quantidade > 10) {
            desconto5perCent(quantidade, valorUnitario);
        } else {
            total(quantidade, valorUnitario);
        }

    }


    public static void escrever(String texto) {
        System.out.println(texto);
    }

    public static void total(double quantidadeAdquirida, double precoUnitario) {
        double total = quantidadeAdquirida * precoUnitario;
        System.out.print("Esse é o valor total: R$" + total);

    }

    public static void desconto2perCent(double quantidadeAdquirida, double precoUnitario) {
        double total = quantidadeAdquirida * precoUnitario;
        double desconto2perCent = total * 0.98;
        System.out.print("Essé é o valor com 2% de desconto: R$" + desconto2perCent);
    }

    public static void desconto3perCent(double quantidadeAdquirida, double precoUnitario) {
        double total = quantidadeAdquirida * precoUnitario;
        double desconto3perCent = total * 0.97;
        System.out.print("Essé é o valor com 3% de desconto: R$" + desconto3perCent);
    }

    public static void desconto5perCent(double quantidadeAdquirida, double precoUnitario) {
        double total = quantidadeAdquirida * precoUnitario;
        double desconto3perCent = total * 0.95;
        System.out.print("Essé é o valor com 5% de desconto: R$" + desconto3perCent);
    }
}