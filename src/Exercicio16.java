import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$
//25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler
//a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva
//o valor a ser pago pelo cliente.

        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva o peso do Morango:");
        double Morango = ler.nextDouble();
        System.out.print("Escreva o peso da Maça");
        double Maca = ler.nextDouble();

        double ValorMorango;
        double ValorMaca;
        double frutas = Maca + Morango;

        if (Morango < 5 || Maca < 5) {
            ValorMorango = 2.50 * Morango;
            ValorMaca = 1.8 * Maca;
            System.out.print("O valor dos Morangos é: R$ " + ValorMorango);
            System.out.print("O valor das Maças é R$ " + ValorMaca);

            if (frutas >= 8) {
                double descontoMorango = ValorMorango * 0.1;
                ValorMorango = ValorMorango - descontoMorango;
                double descontoMaca = ValorMaca * 0.1;
                ValorMaca = ValorMaca - descontoMaca;
                System.out.print("O valor dos Morangos é: R$ " + ValorMorango);
                System.out.print("O valor das Maças é R$ " + ValorMaca);
            }
        }
        if (Morango >= 5 || Maca >= 5) {
            ValorMorango = 2.20 * Morango;
            ValorMaca = 1.5 * Maca;
            System.out.print("O valor dos Morangos é: R$ " + ValorMorango);
            System.out.print("O valor das Maças é R$ " + ValorMaca);

            if (frutas >= 8) {
                double descontoMorango = ValorMorango * 0.1;
                ValorMorango = ValorMorango - descontoMorango;
                double descontoMaca = ValorMaca * 0.1;
                ValorMaca = ValorMaca - descontoMaca;
                System.out.print("O valor dos Morangos é: R$ " + ValorMorango);
                System.out.print("O valor das Maças é R$ " + ValorMaca);
            }
        }
    }
}