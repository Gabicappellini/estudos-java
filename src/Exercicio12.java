import java.util.Scanner;

public class Exercicio12{
    public static void main(String[] args) {
        //- Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e
        //escrever se formam ou não um triângulo. OBS: formar um triângulo, o valor de cada
        //lado deve ser menor que a soma dos outros 2 lados.
        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva o valor do primeiro lado:");
        double a = ler.nextDouble();

        System.out.print("Escreva o valor do segundo lado:");
        double b = ler.nextDouble();

        System.out.print("Escreva o valor do terceiro lado:");
        double c = ler.nextDouble();

        if (a < b + c && b < a + c && c < b + a) {
            System.out.print("Essa forma é um triangulo");
        }
        else{
            System.out.print("Essa forma não é um triângulo");
        }
            }
        }