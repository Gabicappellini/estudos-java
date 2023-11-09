import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
        //por mês, mais uma comissão de 5% por carro vendido, que custa 200.000 cada carro.
        //Escrever um programa que leia o número de carros por ele vendido e o salário fixo. Calcule
        //e escreva o salário final do vendedor

        Scanner ler = new Scanner(System.in);
        float salariofixo;
        System.out.println("Escreva qual valor do seu salário");
        salariofixo = ler.nextFloat();

        int carrosvendidos;
        System.out.println("Qual a quantidade de carros vendidos?");
        carrosvendidos = ler.nextInt();

        float faturamento;
        faturamento = (float)(carrosvendidos * 200000);

        float comissao = (float) (0.05 * faturamento);

        float salariocomissionado;
        salariocomissionado = salariofixo + comissao;
        System.out.print("esse será seu salário R$:" + salariocomissionado);




    }
}