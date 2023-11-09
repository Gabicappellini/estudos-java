import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o numero: ");
        int anitta = ler.nextInt();
        boolean ehImpar = verificarSeNumeroEhImpar(anitta);

        if (ehImpar) {
            escrever("É impar.");
        } else {
            escrever("É par.");
        }

    }

    public static boolean verificarSeNumeroEhImpar(int naruto) {
        int restoDaDivisao = naruto % 2;
        boolean ehImpar = restoDaDivisao != 0;
        return ehImpar;
    }

    public static void escrever(String texto) {
        System.out.println(texto);
    }

}
