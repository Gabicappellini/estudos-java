import java.util.Scanner;
public class Exercicio14 {
    public static void main (String[] args) {

        //Escreva um programa que leia o número de litros vendidos e o tipo de combustível, calcule
        //e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$
        //5,80 e o preço do litro do álcool é R$ 4,30.

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva a quantidade de Alcool");
        double alcool = ler.nextDouble();

        System.out.print("Escreva a quantidade de Gasolina");
        double gasolina = ler.nextDouble();

        double valoralcool = alcool * 4.30;
        double desconto5 = 0.05 * valoralcool;
        double desconto3 = 0.03 * valoralcool;
        double valoralcool5 = valoralcool - desconto5;
        double valoralcool3 = valoralcool - desconto3;


        double valorgasolina = gasolina * 5.80;
        double desconto6 = 0.06 * valorgasolina;
        double desconto4 = 0.04 * valorgasolina;
        double valorgasolina6 = valorgasolina - desconto6;
        double valorgasolina4 = valorgasolina - desconto4;

if (alcool >= 20) {
            System.out.print("O valor do alcool a ser pago é de: R$" + valoralcool5);
}
else{
    System.out.print("O valor do alcool a ser pago é de: R$" + valoralcool3) ;

}
if ( gasolina >= 20){
    System.out.print("O valor da gasolina a ser pago é de: R$" + valorgasolina6);
}
else{
    System.out.print("O valor da gasolina a ser pago é de: R$" + valorgasolina4);
}
    }
//como faço para criar uma condição do usuario colocar a opção de alcool ou gasolina??
}