package classes;

public class ExemploArrays {
    public static void main(String[] args) {
        Galinha galinha = new Galinha();

//        String[] array = new String[3]; numero maximo fixo de posicoes
        int[] arrayDeInteiros = {20, 30, 89, 87, 13, 1, 2, 3};
        //      posicao          0 ,  1,  2, 3....
        //acessar uma posicao do array System.out.println(arrayDeInteiros[2]);

        for (int contador = 0; contador < arrayDeInteiros.length; contador++) {
            int elemento = arrayDeInteiros[contador];
            boolean ehImpar = elemento % 2 != 0;
            if (ehImpar) {
                System.out.println(elemento);
            }
        }
    }
}
