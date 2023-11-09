import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Ler 3 valores (garantir que não serão informados valores iguais) e escrever a soma dos
        //2 maiores.

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        double valor1 = ler.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = ler.nextDouble();
        while (valor2 == valor1) {
            System.out.println("Informe um valor diferente do primeiro:");
            valor2 = ler.nextDouble();
        }
        System.out.print("Informe o terceiro valor");
        double valor3 = ler.nextDouble();
        while (valor3 == valor2 || valor3 == valor1) {
            System.out.println("Informe um valor diferente dos anteriores:");
            valor3 = ler.nextDouble();
        }
        double maior, segundoMaior;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            segundoMaior = retornaValorMaior(valor2, valor3);
        }

        if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            segundoMaior = retornaValorMaior(valor1, valor3);
        }

        if (valor3 > valor2 && valor3 > valor1) {
            maior = valor3;
            if (valor2 > valor1) {
                segundoMaior = valor2;
            } else {
                segundoMaior = valor1;
            }
            double soma = maior + segundoMaior;
            System.out.println("A Soma dos dois maiores valores é:" + soma);
        }
    }

    public static double retornaValorMaior(double ludmilla, double cnpjoto) {
//        double maior =  ludmilla > cnpjoto ? ludmilla : cnpjoto;
//        return maior;

        if (ludmilla > cnpjoto) {
            return ludmilla;
        } else {
            return cnpjoto;
        }
    }
}

