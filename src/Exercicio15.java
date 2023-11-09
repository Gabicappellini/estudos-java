import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        //- Escreva um programa que leia as idades de 2 homens e de 2 mulheres (garantir que as
        //idades dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule
        //e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto
        //das idades do homem mais novo com a mulher mais velha

        Scanner ler = new Scanner(System.in);


        System.out.print("Qual a idade do primeiro homem?");
        int homem1 = ler.nextInt();
        System.out.print("Qual a idade do segundo homem?");
        int homem2 = ler.nextInt();

        while (homem1 == homem2) {
            System.out.print("A idade do segundo homem não pode ser igual do primeiro");
            homem2 = ler.nextInt();
        }

        System.out.print("Qual a idade da primeira mulher?");
        int mulher1 = ler.nextInt();
        System.out.print("Qual a idade da primeira mulher?");
        int mulher2 = ler.nextInt();

        while (mulher1 == mulher2) {
            System.out.print("A idade da segunda mulher não pode ser igual da primeira");
            mulher2 = ler.nextInt();
        }

        int Hvelho;
        int Hnovo;
        if (homem1 > homem2) {
            Hvelho = homem1;
            Hnovo = homem2;
        } else {
            Hvelho = homem2;
            Hnovo = homem1;
        }

        int Mvelha;
        int Mnova;
        if (mulher1 > mulher2) {
            Mvelha = mulher1;
            Mnova = mulher2;
        } else {
            Mvelha = mulher2;
            Mnova = mulher1;
        }
        int soma = Hvelho + Mnova;

        System.out.println("A soma do Homem mais velho com a Mulher mais nova é: " + soma);
        System.out.println("O produto do Homem mais novo com a Mulher mais velha é: " + Hnovo * Mvelha);
    }
}
/// a soma está dando errado.nao sei pq