import java.util.Scanner;

public class Exercicio06 {
    public static void main(String [] args) {
        //1 - Faça um programa que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem:
        //“Múltiplo de 10” usando o WHILE
        Scanner in = new Scanner(System.in);
int A=1;

        while (A <=100) {
        System.out.println(A++);
            if (A % 10 == 0) {
            System.out.println("Múltiplo de 10");
            }
        }
    }


}


