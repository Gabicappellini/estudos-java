import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Um funcionário irá receber um reajuste de salário de tantos porcento. Escreva um
        //programa para ler (input) o salário mensal atual desse funcionário e o percentual de
        //reajuste. Calcular e escrever (print) o valor do novo salário.

        Scanner ler = new Scanner(System.in);
        int salarioantigo;
        System.out.println("Qual o salário antigo do José?");
        salarioantigo = ler.nextInt();

        int salarioatual;
        System.out.println("Qual o novo salário do José?");
        salarioatual = ler.nextInt();

        float percentualreajuste;
        float diferencasalarial;
        diferencasalarial = salarioatual - salarioantigo;
        percentualreajuste = diferencasalarial / salarioantigo * 100;

        System.out.println("Esse é o percentual de reajuste do salário de José");
        System.out.println(percentualreajuste + "%");




        }
    }