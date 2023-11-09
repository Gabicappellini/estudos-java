import java.util.Scanner;

// FOR (LAÇO DE REPETIÇÃO)
// precisa de uma variavel auxiliar
// 1º passo = ponto de inicio, onde vai começar
// 2º passo = quando vai terminar (boolean)
// 3º passo = incrementar
        //int colheradas = 19;

                // OPERADOR DE INCREMENTO
                //  colheradas =  colheradas + 1;     //(JEITO MANUAL)
                //colheradas++;

// OPERADOR RESTO DE DIVISÃO É:    %
//        int restoDaDivisao = 10 % 2;

/*String senhaCorreta = "gabi123";
boolean acertouASenha = false;
while (!acertouASenha) {
    System.out.println("Informe sua senha: ");
    String senhaDigitada = ler.nextLine().toString();
    acertouASenha = senhaDigitada.equals(senhaCorreta);
    if (acertouASenha) {
        System.out.println("Bem vindo, senha correta!!!!");*/

public class Exercicio01 {
    public static void main(String[] args) {
    //1 - Faça um programa que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem:
    //“Múltiplo de 10”

        for (int A = 1; A <= 100; A++) {
            System.out.println(A);
            if (A % 10 == 0) {
                System.out.println("Multiplo de 10");
            }
            else {
                System.out.println("Não é mutiplo de 10");
            }
        }
    }
}




