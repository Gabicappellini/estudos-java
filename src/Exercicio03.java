import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Escreva um programa para ler o número total de eleitores de um município, o número de
        //votos brancos, nulos e válidos. Calcular e printar o percentual que cada um representa em
        //relação ao total de eleitores.

        Scanner ler = new Scanner(System.in);
        int eleitores;
        System.out.println("escreva o total de eleitores do município de Confresa");
        eleitores = ler.nextInt();

        int votosNulos;
        System.out.println("escreva o número total de votos Nulos");
        votosNulos = ler.nextInt();

        int votosBrancos;
        System.out.println("escreva o número total de votos Brancos");
        votosBrancos = ler.nextInt();

        int votosValidos;
        System.out.println("escreva o número total de votos Válidos");
        votosValidos = ler.nextInt();

int nulosPorcent ;
        nulosPorcent = votosNulos * 100 / eleitores;

        int brancosPorcent;
        brancosPorcent = votosBrancos * 100 / eleitores;

        int validosPorcent;
         validosPorcent = votosValidos *100 /eleitores ;

        System.out.println("Essa é a porcentagem de votos Nulos");
        System.out.println(nulosPorcent);

        System.out.println("Essa é a porcentagem de votos Brancos");
        System.out.println(brancosPorcent);

        System.out.println("Essa é a porcentagem de votos Válidos");
        System.out.println(validosPorcent);



    }
    }