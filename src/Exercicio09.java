import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior
        //deles.

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numero 1: ");
        double a = ler.nextFloat();

        System.out.println("Informe o numero 2: ");
        double b = ler.nextFloat();

        System.out.println("Informe o numero 3: ");
        double c = ler.nextFloat();

        double maior=0;
        if (a>b && a>c){
            maior = a;
        }
        if (b>a && b>c){
            maior = b;
        }
        if (c>a && c>b){
            maior = c;
        }

        System.out.println("O maior numero é: " + maior);

    }
}