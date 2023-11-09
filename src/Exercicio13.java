import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso os
        //números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
        //‘Segundo maior’, caso o segundo seja maior que o primeiro

        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva um valor");
        double a = ler.nextDouble();

        System.out.print("Escreva um segundo valor");
        double b = ler.nextDouble();

        if (a == b) {
            System.out.print("Números iguais");
        }
            if (a > b) {
                System.out.print("Primeiro é maior");
            }
            if (b > a){
                System.out.println("Segundo é maior");
                }
            }
        }


