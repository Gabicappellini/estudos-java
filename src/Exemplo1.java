import classes.Pessoa;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = ler.next();
        Pessoa gabriela = new Pessoa();
        Pessoa heber = new Pessoa();

//        gabriela.nome = "Gabriela CMAmaa";
//        heber.nome = "Heber kjakja";

        gabriela.idade = 19;
        heber.idade = 89;

        gabriela.seApresentar();
        heber.seApresentar();
    }
}


