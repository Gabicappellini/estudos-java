import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //Crie um programa que converta 3 temperaturas em Celsius informadas pelo usuário e
        //converta para Fahrenheit. Escreva na tela as 3 temperaturas convertidas.

        Scanner ler = new Scanner(System.in);
        float temperaturaC1;
        float temperaturaC2;
        float temperaturaC3;
        System.out.print("Escreva quais são as três ultimas temperaturas" + "\n");
        System.out.print("Temperatura 1");
        temperaturaC1 = ler.nextFloat();
        System.out.print("Temperatura 2");
        temperaturaC2 = ler.nextFloat();
        System.out.print("Temperatura 3");
        temperaturaC3 = ler.nextFloat();

        double temperaturaF1 = (temperaturaC1 * 1.38 + 32);
        double temperaturaF2 = (temperaturaC2 * 1.38 + 32);
        double temperaturaF3 = (temperaturaC3 * 1.38 + 32);

        System.out.print("A temperatura de " + temperaturaC1 + "é igual a " + temperaturaF1 + " F"+ "\n");
        System.out.print("A temperatura de " + temperaturaC2 + "é igual a " + temperaturaF2 + " F" + "\n");
        System.out.print("A temperatura de " + temperaturaC3 + "é igual a " + temperaturaF3 + " F" + "\n");

    }
}