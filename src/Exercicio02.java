import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //AQUI VAI O SEU CODIGO
        // como ler uma entrada:
        // https://www.devmedia.com.br/java-como-ler-e-apresentar-dados-com-os-comandos-de-entrada-e-saida/22266

        //import java.util.Scanner; (colar na primeira linha do arquivo)
        // Scanner ler = new Scanner(System.in);
        //ler idade de uma pessoa em anos, printar a idade em dias e meses.
        //ano sempre 365 dias e mes sempre 30 dias.
        Scanner ler = new Scanner(System.in);
    int idade;
    System.out.println("escreva sua idade");
    idade = ler.nextInt();

    int idadeMes = idade * 12;
    int idadeDia = idade * 365;

    System.out.println("Essa é sua idade em meses");
    System.out.println(idadeMes);

System.out.println("Essa e sua idade em dias");
System.out.println(idadeDia);




    }
}