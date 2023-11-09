import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em
        //ordem crescente.
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
        double maiorValor=0;
        double segundoMaior=0;
        double menor=0;

        if (valor1 > valor2 && valor1 > valor3) {
            maiorValor = valor1;
            if (valor2 > valor3){
                segundoMaior = valor2;
                menor = valor3;
            }else{
                segundoMaior = valor3;
                menor = valor2;
            }
        }
        if (valor2 > valor1 && valor2 > valor3){
            maiorValor = valor2;
            if (valor1 > valor3){
                segundoMaior = valor1;
                menor = valor3;
            }else{
                segundoMaior = valor3;
                menor = valor1;
            }
        }
        if (valor3 > valor1 && valor3 > valor2){
            maiorValor = valor3;
            if (valor1 > valor2) {
                segundoMaior = valor1;
                menor = valor2;
            }else{
                segundoMaior = valor2;
                menor = valor1;
            }
        }
        System.out.print(maiorValor + "\n" + segundoMaior + "\n" + menor);
    }
}